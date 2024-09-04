package com.prueba.pruebaTec.apiRest;

import com.prueba.pruebaTec.aplicacion.BusquedaPrecioCasoUso;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.PreciosApi;
import org.openapitools.model.PreciosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class BusquedaPrecioController implements PreciosApi {

    @Autowired
    private BusquedaPrecioCasoUso busquedaPrecioCasoUso;

    public ResponseEntity<List<PreciosDTO>> busquedaPrecios(OffsetDateTime fechaAplicacion,  Long cadenaId, Long productoId){
        List<PreciosDTO> datos=this.busquedaPrecioCasoUso.busquedaPrecios(fechaAplicacion,cadenaId,productoId);
        if(datos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(datos,HttpStatus.OK);
        }
    }
}