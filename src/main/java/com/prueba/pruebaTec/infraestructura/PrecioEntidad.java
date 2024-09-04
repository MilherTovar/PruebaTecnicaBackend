package com.prueba.pruebaTec.infraestructura;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRECIO")
public class PrecioEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listaPrecio;

    private LocalDateTime fechaInicial;

    private LocalDateTime fechaFinal;

    private Double precio;

    @ManyToOne
    @JoinColumn(name="CADENA_ID")
    private CadenaEntidad cadenaId;

    @ManyToOne
    @JoinColumn(name="PRODUCTO_ID")
    private ProductoEntidad productoId;

    private int prioridad;

    @ManyToOne
    @JoinColumn(name="MONEDA_ID")
    private MonedaEntidad monedaEntidad;

}
