package com.prueba.pruebaTec.infraestructura.repositorio;

import com.prueba.pruebaTec.infraestructura.CadenaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadenaRespositorio extends JpaRepository<CadenaEntidad, Integer> {
}
