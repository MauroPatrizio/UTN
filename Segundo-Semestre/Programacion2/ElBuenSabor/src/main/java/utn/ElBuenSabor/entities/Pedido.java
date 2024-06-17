package utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import utn.ElBuenSabor.entities.enums.Estado;
import utn.ElBuenSabor.entities.enums.FormaPago;
import utn.ElBuenSabor.entities.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "pedidos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido extends Base{
    @Column(name = "hora_estimada_finalizacion")
    private LocalTime horaEstimadaFinalizacion;
    private Double total = 0.0;
    @Column(name = "total_costo")
    private Double totalCosto;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_envio")
    private TipoEnvio tipoEnvio;
    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pago")
    private FormaPago formaPago;
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @OneToOne
    @JoinColumn(name = "factura_id")
    private Factura factura;


}
