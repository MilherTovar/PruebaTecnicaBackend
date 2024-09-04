package com.prueba.pruebaTec.infraestructura;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CADENA")
public class CadenaEntidad {

    @Id
    @JoinColumn(name="CADENA_ID")
    private Integer cadenaId;

    private String nombreCadena;
}
