package utn.ElBuenSabor.controllers;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.preference.PreferenceBackUrlsRequest;
import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.ElBuenSabor.entities.Pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mp")
public class MercadoPagoController {

    @Value("${codigo.mercadopago}")
    private String mpToken;

    @PostMapping()
    public String getList(@RequestBody Pedido pedido) throws Exception {
        if(pedido == null) {
            return "Error recibien el pedido";
        }

        String title = "Pedido nro: " + pedido.getId();
        int quantity = 1;
        Double price = pedido.getTotal();

        try {
            MercadoPagoConfig.setAccessToken(mpToken);
            PreferenceItemRequest itemRequest = PreferenceItemRequest.builder()
                    .title(title)
                    .quantity(quantity)
                    .unitPrice(new BigDecimal(price))
                    .currencyId("ARS")
                    .build();
            List<PreferenceItemRequest> items = new ArrayList<>();
            items.add(itemRequest);

            PreferenceBackUrlsRequest backUrlsRequest = PreferenceBackUrlsRequest.builder()
                    .success("/pago_exitoso")
                    .pending("/pago_pendiente")
                    .failure("/pago_fallido")
                    .build();

            PreferenceRequest preferenceRequest = PreferenceRequest.builder()
                    .items(items)
                    .backUrls(backUrlsRequest)
                    .build();

            PreferenceClient client = new PreferenceClient();

            Preference preference = client.create(preferenceRequest);

            return preference.getId();

        }catch (MPException | MPApiException mpe){
            throw new Exception(mpe.getMessage());
        }
    }
}
