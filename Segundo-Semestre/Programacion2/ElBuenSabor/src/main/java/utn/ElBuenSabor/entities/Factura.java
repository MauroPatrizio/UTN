package utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import utn.ElBuenSabor.entities.enums.FormaPago;

import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends Base{

    @Column(name = "fecha_facturacion")
    private LocalDate fechaFacturacion;
    @Column(name = "mp_payment_id")
    private Integer mpPaymentId;
    @Column(name = "mp_merchant_order_id")
    private Integer mpMerchantOrderId;
    @Column(name = "mp_preference_id")
    private String mpPreferenceId;
    @Column(name = "mp_payment_type")
    private String mpPaymentType;
    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pago")
    private FormaPago formaPago;
    @Column(name = "total_venta")
    private Double totalVenta;

}
