package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Usuario_ingresadoDTO;
import com.devicecontrol.persistence.entity.Usuario_ingresado;

@Mapper
public interface Usuario_IngresadoMapper {
    
    @Mapping(source = "id_usuario_i", target = "id_usuario_i")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "activo_equipo", target = "activo_equipo")
    Usuario_ingresadoDTO toDTO(Usuario_ingresado usuarioIngresado);

    // Mapea de Usuario_ingresadoDTO a Usuario_ingresado
    @Mapping(source = "id_usuario_i", target = "id_usuario_i")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "activo_equipo", target = "activo_equipo")
    Usuario_ingresado toEntity(Usuario_ingresadoDTO usuarioIngresadoDTO);
}
