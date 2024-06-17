package com.example.BuenSabor;

import com.example.BuenSabor.enums.TipoPromocion;
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
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;


    @Enumerated(EnumType.STRING)
    private TipoPromocion tipoPromocion;

    @OneToMany(mappedBy = "promocion")
    private List<PromocionDetalle> detalles;


}
