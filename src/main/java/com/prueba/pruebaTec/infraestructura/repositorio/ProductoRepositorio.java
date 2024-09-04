package com.prueba.pruebaTec.infraestructura.repositorio;

import com.prueba.pruebaTec.infraestructura.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<ProductoEntidad, Integer> {
}
