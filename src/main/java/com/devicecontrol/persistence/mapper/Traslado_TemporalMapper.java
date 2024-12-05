package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Traslado_temporalDTO;
import com.devicecontrol.persistence.entity.Traslado_temporal;

@Mapper
public interface Traslado_TemporalMapper {
    
     // Mapeo de Traslado_temporal a Traslado_temporalDTO
    @Mapping(source = "id_traslado_temporal", target = "idTrasladoTemporal")
    @Mapping(source = "traslado.id_traslado", target = "idTraslado")  // Mapea la relación con Traslado
    Traslado_temporalDTO toDTO(Traslado_temporal traslado_temporal);

    // Mapeo de Traslado_temporalDTO a Traslado_temporal
    @Mapping(source = "idTrasladoTemporal", target = "id_traslado_temporal")
    @Mapping(source = "idTraslado", target = "traslado.id_traslado")  // Mapea la relación con Traslado
    Traslado_temporal toEntity(Traslado_temporalDTO traslado_temporalDTO);
}