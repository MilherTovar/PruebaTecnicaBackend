package com.prueba.pruebaTec.infraestructura.repositorio;

import com.prueba.pruebaTec.infraestructura.PrecioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PrecioRepositorio extends JpaRepository<PrecioEntidad, Integer> {

    @Query(value = "select" +
            "   pri" +
            " from" +
            "   PrecioEntidad as pri" +
            " where" +
            " pri.cadenaId.cadenaId=?1" +
            "   and pri.productoId.productoId=?2" +
            "   and ?3 between pri.fechaInicial and pri.fechaFinal")
    List<PrecioEntidad> ConsultaPrecios(Integer cadena, Integer producto, LocalDateTime fecha);
}
