package com.prueba.pruebaTec.aplicacion;


import org.openapitools.model.PreciosDTO;

import java.time.OffsetDateTime;
import java.util.List;

public interface BusquedaPrecioCasoUso {

    List<PreciosDTO> busquedaPrecios(OffsetDateTime fechaAplicacion, Long cadenaId, Long productoId);
}
