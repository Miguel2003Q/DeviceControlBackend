package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.SeguridadDTO;
import com.devicecontrol.persistence.entity.Seguridad;

@Mapper
public interface SeguridadMapper {
    
    // Convierte de Seguridad a SeguridadDTO
    @Mapping(source = "id_seguridad", target = "idSeguridad")
    SeguridadDTO toDTO(Seguridad seguridad);

    // Convierte de SeguridadDTO a Seguridad
    @Mapping(source = "idSeguridad", target = "id_seguridad")
    Seguridad toEntity(SeguridadDTO seguridadDTO);
}
