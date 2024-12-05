package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Activo_EquipoDTO;
import com.devicecontrol.persistence.entity.Activo_Equipo;

@Mapper
public interface Activo_EquipoMapper {
    
        // Convierte de Activo_Equipo a Activo_EquipoDTO
        @Mapping(source = "id_equipo", target = "idEquipo")
        @Mapping(source = "tipo_activo", target = "tipoActivo")
        @Mapping(source = "activo.id_activo", target = "idActivo")
        @Mapping(source = "usuario_ingresado.id_usuario_i", target = "idUsuarioIngresado")
        Activo_EquipoDTO toDTO(Activo_Equipo activoEquipo);
    
        // Convierte de Activo_EquipoDTO a Activo_Equipo
        @Mapping(source = "idEquipo", target = "id_equipo")
        @Mapping(source = "tipoActivo", target = "tipo_activo")
        @Mapping(source = "idActivo", target = "activo.id_activo")
        @Mapping(source = "idUsuarioIngresado", target = "usuario_ingresado.id_usuario_i")
        Activo_Equipo toEntity(Activo_EquipoDTO activoEquipoDTO);
}
