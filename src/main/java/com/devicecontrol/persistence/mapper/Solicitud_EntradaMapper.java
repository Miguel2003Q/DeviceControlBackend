package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Solicitud_entradaDTO;
import com.devicecontrol.persistence.entity.Solicitud_entrada;

@Mapper
public interface Solicitud_EntradaMapper {
    
    // Convierte de Solicitud_entrada a Solicitud_entradaDTO
    @Mapping(source = "id_solicitud_entrada", target = "idSolicitudEntrada")
    @Mapping(source = "solicitud.id_solicitud", target = "idSolicitud") // Mapeo del id de Solicitud
    Solicitud_entradaDTO toDTO(Solicitud_entrada solicitud_entrada);

    // Convierte de Solicitud_entradaDTO a Solicitud_entrada
    @Mapping(source = "idSolicitudEntrada", target = "id_solicitud_entrada")
    @Mapping(source = "idSolicitud", target = "solicitud.id_solicitud") // Mapeo del id de Solicitud
    Solicitud_entrada toEntity(Solicitud_entradaDTO solicitud_entradaDTO);
}
