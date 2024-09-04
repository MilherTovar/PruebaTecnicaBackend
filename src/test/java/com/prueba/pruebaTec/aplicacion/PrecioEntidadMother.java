package com.prueba.pruebaTec.aplicacion;

import com.prueba.pruebaTec.infraestructura.CadenaEntidad;
import com.prueba.pruebaTec.infraestructura.MonedaEntidad;
import com.prueba.pruebaTec.infraestructura.PrecioEntidad;
import com.prueba.pruebaTec.infraestructura.ProductoEntidad;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PrecioEntidadMother {

    public static List<PrecioEntidad> get(){
        List<PrecioEntidad> precioEntidads=new ArrayList<>();
        CadenaEntidad cadenaEntidad=CadenaEntidad.builder().cadenaId(1).nombreCadena("ZARA")
                .build();
        MonedaEntidad monedaEntidad=MonedaEntidad.builder().monedaId(1).monedaNombre("EUR")
                .build();
        ProductoEntidad productoEntidad=ProductoEntidad.builder().productoId(35455)
                .nombreProducto("Producto1").build();
        PrecioEntidad precioEntidad1=new PrecioEntidad();
        precioEntidad1.setPrecio(35.50);
        precioEntidad1.setMonedaEntidad(monedaEntidad);
        precioEntidad1.setProductoId(productoEntidad);
        precioEntidad1.setPrioridad(0);
        precioEntidad1.setCadenaId(cadenaEntidad);
        precioEntidad1.setFechaInicial(LocalDateTime.of(2020,6,14,0,0,0));
        precioEntidad1.setFechaFinal(LocalDateTime.of(2020,12,31,23,59,59));
        precioEntidads.add(precioEntidad1);
        PrecioEntidad precioEntidad2=new PrecioEntidad();
        precioEntidad2.setMonedaEntidad(monedaEntidad);
        precioEntidad2.setProductoId(productoEntidad);
        precioEntidad2.setCadenaId(cadenaEntidad);
        precioEntidad2.setFechaInicial(LocalDateTime.of(2020,6,14,15,0,0));
        precioEntidad2.setFechaFinal(LocalDateTime.of(2020,6,14,18,30,0));
        precioEntidad2.setPrioridad(1);
        precioEntidad2.setPrecio(25.45);
        precioEntidads.add(precioEntidad2);
        PrecioEntidad precioEntidad3=new PrecioEntidad();
        precioEntidad3.setMonedaEntidad(monedaEntidad);
        precioEntidad3.setProductoId(productoEntidad);
        precioEntidad3.setCadenaId(cadenaEntidad);
        precioEntidad3.setFechaInicial(LocalDateTime.of(2020,6,15,0,0,0));
        precioEntidad3.setFechaFinal(LocalDateTime.of(2020,6,15,11,0,0));
        precioEntidad3.setPrioridad(1);
        precioEntidad3.setPrecio(30.50);
        precioEntidads.add(precioEntidad3);
        PrecioEntidad precioEntidad4=new PrecioEntidad();
        precioEntidad4.setMonedaEntidad(monedaEntidad);
        precioEntidad4.setProductoId(productoEntidad);
        precioEntidad4.setCadenaId(cadenaEntidad);
        precioEntidad4.setFechaInicial(LocalDateTime.of(2020,6,15,16,0,0));
        precioEntidad4.setFechaFinal(LocalDateTime.of(2020,12,31,23,59,59));
        precioEntidad4.setPrioridad(1);
        precioEntidad4.setPrecio(38.95);
        precioEntidads.add(precioEntidad4);
        return precioEntidads;
    }

}
