package com.prueba.pruebaTec.aplicacion;

import com.prueba.pruebaTec.infraestructura.PrecioEntidad;
import com.prueba.pruebaTec.infraestructura.repositorio.PrecioRepositorio;
import org.openapitools.model.PreciosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class BusquedaPrecioCasoUsoImpl implements BusquedaPrecioCasoUso{

    @Autowired
    private PrecioRepositorio precioRepositorio;

    @Override
    public List<PreciosDTO> busquedaPrecios(OffsetDateTime fechaAplicacion, Long cadenaId, Long productoId) {
        return map(precioRepositorio.ConsultaPrecios(cadenaId.intValue(),productoId.intValue(),fechaAplicacion.toLocalDateTime()));
    }

    private List<PreciosDTO> map(List<PrecioEntidad> src){
        List<PreciosDTO> retorno=new ArrayList<>();
        for(int i=0;i<src.size();i++){
            PreciosDTO preciosDTO=new PreciosDTO();
            preciosDTO.setPrecio(src.get(i).getPrecio());
            preciosDTO.setCadenaId(src.get(i).getCadenaId().getCadenaId().longValue());
            preciosDTO.setProductoId(src.get(i).getProductoId().getProductoId().longValue());
            preciosDTO.setTarifa(src.get(i).getPrecio());
            preciosDTO.setFecha(src.get(i).getFechaFinal().toString());
            retorno.add(preciosDTO);
        }
        return retorno;
    }
}
