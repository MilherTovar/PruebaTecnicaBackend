package com.prueba.pruebaTec.aplicacion;

import com.prueba.pruebaTec.infraestructura.PrecioEntidad;
import com.prueba.pruebaTec.infraestructura.repositorio.PrecioRepositorio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.model.PreciosDTO;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class BusquedaPrecioCasoUsoImplTest {

    @InjectMocks
    private BusquedaPrecioCasoUsoImpl busquedaPrecioCasoUso;

    @Mock
    private PrecioRepositorio precioRepositorio;

    @Test
    void BusquedaCorrecta(){

        List<PrecioEntidad>inicial=PrecioEntidadMother.get();
        when(this.precioRepositorio.ConsultaPrecios(any(), any(), any())).thenReturn(inicial);

        OffsetDateTime fechaAplicacion = OffsetDateTime.of(2020, 6, 14, 10, 0, 0, 0, ZoneOffset.of("+01:00"));
        List<PreciosDTO> datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,1L,35455L);

        verify(this.precioRepositorio).ConsultaPrecios(any(), any(), any());
        assertThat(datos).isNotEmpty();
        int dia=fechaAplicacion.getDayOfMonth();
        int hora=fechaAplicacion.getHour();
        System.out.println("Test 1: petición a las "+hora+" del día "+dia+" del producto "+datos.get(0).getProductoId() +
                " para la brand "+inicial.get(0).getCadenaId().getCadenaId()+ " ("+inicial.get(0).getCadenaId().getNombreCadena()+")");

        fechaAplicacion = OffsetDateTime.of(2020, 6, 14, 16, 0, 0, 0, ZoneOffset.of("+01:00"));
        datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,1L,35455L);

        assertThat(datos).isNotEmpty();
        dia=fechaAplicacion.getDayOfMonth();
        hora=fechaAplicacion.getHour();
        System.out.println("Test 2: petición a las "+hora+" del día "+dia+" del producto "+datos.get(0).getProductoId() +
                " para la brand "+inicial.get(0).getCadenaId().getCadenaId()+ " ("+inicial.get(0).getCadenaId().getNombreCadena()+")");

        fechaAplicacion = OffsetDateTime.of(2020, 6, 14, 21, 0, 0, 0, ZoneOffset.of("+01:00"));
        datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,1L,35455L);

        assertThat(datos).isNotEmpty();
        dia=fechaAplicacion.getDayOfMonth();
        hora=fechaAplicacion.getHour();
        System.out.println("Test 3: petición a las "+hora+" del día "+dia+" del producto "+datos.get(0).getProductoId() +
                " para la brand "+inicial.get(0).getCadenaId().getCadenaId()+ " ("+inicial.get(0).getCadenaId().getNombreCadena()+")");

        fechaAplicacion = OffsetDateTime.of(2020, 6, 15, 10, 0, 0, 0, ZoneOffset.of("+01:00"));
        datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,1L,35455L);

        assertThat(datos).isNotEmpty();
        dia=fechaAplicacion.getDayOfMonth();
        hora=fechaAplicacion.getHour();
        System.out.println("Test 4: petición a las "+hora+" del día "+dia+" del producto "+datos.get(0).getProductoId() +
                " para la brand "+inicial.get(0).getCadenaId().getCadenaId()+ " ("+inicial.get(0).getCadenaId().getNombreCadena()+")");

        fechaAplicacion = OffsetDateTime.of(2020, 6, 16, 21, 0, 0, 0, ZoneOffset.of("+01:00"));
        datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,1L,35455L);

        assertThat(datos).isNotEmpty();
        dia=fechaAplicacion.getDayOfMonth();
        hora=fechaAplicacion.getHour();
        System.out.println("Test 5: petición a las "+hora+" del día "+dia+" del producto "+datos.get(0).getProductoId() +
                " para la brand "+inicial.get(0).getCadenaId().getCadenaId()+ " ("+inicial.get(0).getCadenaId().getNombreCadena()+")");
    }

    @Test
    void BusquedaInCorrecta(){

        Mockito.lenient().when(this.precioRepositorio.ConsultaPrecios(any(), any(), any())).thenReturn(new ArrayList<>());

        OffsetDateTime fechaAplicacion = OffsetDateTime.of(2020, 6, 14, 10, 0, 0, 0, ZoneOffset.of("+01:00"));
        List<PreciosDTO> datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,1L,35455L);

        verify(this.precioRepositorio).ConsultaPrecios(any(), any(), any());
        assertThat(datos).isEmpty();
        System.out.print("Test Correcto para Busqueda incorrecta");
    }
}
