package com.devicecontrol.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.SolicitudDTO;
import com.devicecontrol.persistence.entity.Solicitud;

@Mapper
public interface SolicitudMapper {
    
    // Mapea de la entidad Solicitud a su DTO SolicitudDTO
    @Mapping(source = "id_solicitud", target = "idSolicitud")
    @Mapping(source = "ambiente.id_ambiente", target = "ambiente.idAmbiente") // Mapea la relación con Ambiente
    @Mapping(source = "instructor.id_instructor", target = "instructor.id_instructor") // Mapea la relación con Instructor
    @Mapping(source = "seguridad.id_seguridad", target = "seguridad.idSeguridad") // Mapea la relación con Seguridad
    List<SolicitudDTO> toDTOList(List<Solicitud> solicitudes);

    // Mapea de SolicitudDTO a la entidad Solicitud
    @Mapping(source = "idSolicitud", target = "id_solicitud")
    @Mapping(source = "ambiente.idAmbiente", target = "ambiente.id_ambiente") // Mapea la relación con Ambiente
    @Mapping(source = "instructor.id_instructor", target = "instructor.id_instructor") // Mapea la relación con Instructor
    @Mapping(source = "seguridad.idSeguridad", target = "seguridad.id_seguridad") // Mapea la relación con Seguridad
    Solicitud toEntity(SolicitudDTO solicitudDTO);
}
