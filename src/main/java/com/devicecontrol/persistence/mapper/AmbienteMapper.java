package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.AmbienteDTO;
import com.devicecontrol.persistence.entity.Ambiente;

@Mapper
public interface AmbienteMapper {
    
    // Convierte de Ambiente a AmbienteDTO
    @Mapping(source = "id_ambiente", target = "idAmbiente")
    @Mapping(source = "nombre_ambiente", target = "nombreAmbiente")
    @Mapping(source = "categoria.id_categoria", target = "idCategoria")
    @Mapping(source = "descipcion", target = "descripcion") // Nota: corregir el nombre en la entidad si es un error.
    AmbienteDTO toDTO(Ambiente ambiente);

    // Convierte de AmbienteDTO a Ambiente
    @Mapping(source = "idAmbiente", target = "id_ambiente")
    @Mapping(source = "nombreAmbiente", target = "nombre_ambiente")
    @Mapping(source = "idCategoria", target = "categoria.id_categoria")
    @Mapping(source = "descripcion", target = "descipcion")
    Ambiente toEntity(AmbienteDTO ambienteDTO);
}
