package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Solicitud_salidaDTO;
import com.devicecontrol.persistence.entity.Solicitud_salida;

@Mapper
public interface Solicitud_SalidaMapper {
    
    // Convierte de Solicitud_salida a Solicitud_salidaDTO
    @Mapping(source = "descripcion_solicitud", target = "descripcionSolicitud")
    @Mapping(source = "id_solicitud_salida", target = "idSolicitudSalida")
    @Mapping(source = "solicitud.id_solicitud", target = "idSolicitud") // Mapeo del id de Solicitud
    Solicitud_salidaDTO toDTO(Solicitud_salida solicitud_salida);

    // Convierte de Solicitud_salidaDTO a Solicitud_salida
    @Mapping(source = "descripcionSolicitud", target = "descripcion_solicitud")
    @Mapping(source = "idSolicitudSalida", target = "id_solicitud_salida")
    @Mapping(source = "idSolicitud", target = "solicitud.id_solicitud") // Mapeo del id de Solicitud
    Solicitud_salida toEntity(Solicitud_salidaDTO solicitud_salidaDTO);
}
