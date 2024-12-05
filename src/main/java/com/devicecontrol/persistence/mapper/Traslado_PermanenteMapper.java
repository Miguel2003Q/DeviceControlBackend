package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Traslado_permanenteDTO;
import com.devicecontrol.persistence.entity.Traslado_permanente;

@Mapper
public interface Traslado_PermanenteMapper {
    
    // Mapeo de Traslado_permanente a Traslado_permanenteDTO
    @Mapping(source = "fecha_traslado", target = "fechaTraslado")
    @Mapping(source = "id_traslado_permanente", target = "idTrasladoPermanente")
    @Mapping(source = "traslado.id_traslado", target = "idTraslado")  // Mapea la relación con Traslado
    Traslado_permanenteDTO toDTO(Traslado_permanente traslado_permanente);

    // Mapeo de Traslado_permanenteDTO a Traslado_permanente
    @Mapping(source = "fechaTraslado", target = "fecha_traslado")
    @Mapping(source = "idTrasladoPermanente", target = "id_traslado_permanente")
    @Mapping(source = "idTraslado", target = "traslado.id_traslado")  // Mapea la relación con Traslado
    Traslado_permanente toEntity(Traslado_permanenteDTO traslado_permanenteDTO);
}
