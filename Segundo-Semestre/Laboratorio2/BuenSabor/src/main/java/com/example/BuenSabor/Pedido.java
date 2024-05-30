package com.example.BuenSabor;

import com.example.BuenSabor.enums.Estado;
import com.example.BuenSabor.enums.FormaPago;
import com.example.BuenSabor.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

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

    @OneToMany(mappedBy = "pedido")
    private List<DetallePedido> detalles;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
