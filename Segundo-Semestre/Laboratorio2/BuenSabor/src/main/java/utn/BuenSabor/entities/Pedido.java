package utn.BuenSabor.entities;


import com.example.BuenSabor.enums.Estado;
import com.example.BuenSabor.enums.FormaPago;
import com.example.BuenSabor.enums.TipoEnvio;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private LocalDate fechaPedido;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    public Pedido(){
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, LocalDate fechaPedido, Estado estado, FormaPago formaPago, TipoEnvio tipoEnvio, List<DetallePedido> detalles, Cliente cliente) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.formaPago = formaPago;
        this.tipoEnvio = tipoEnvio;
        this.cliente = cliente;
    }

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "empleado_pedido_id")
    private Empleado empleado;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "domicilio_pedido_id")
    private Domicilio domicilio;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "sucursal_pedido_id")
    private Sucursal sucursal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "factura_id")
    private Factura factura;

}
