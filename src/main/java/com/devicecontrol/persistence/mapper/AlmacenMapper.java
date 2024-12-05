package com.devicecontrol.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.AlmacenDTO;
import com.devicecontrol.persistence.entity.Almacen;

@Mapper(componentModel = "spring", uses = ActivoMapper.class)
public interface AlmacenMapper {

    // Convierte de Almacen a AlmacenDTO
    @Mapping(source = "id_almacen", target = "idAlmacen")
    @Mapping(source = "activo", target = "activo")
    AlmacenDTO toDTO(Almacen almacen);

    // Convierte de AlmacenDTO a Almacen
    @Mapping(source = "idAlmacen", target = "id_almacen")
    @Mapping(source = "activo", target = "activo")
    Almacen toEntity(AlmacenDTO almacenDTO);

    // Métodos auxiliares para listas, si es necesario (MapStruct puede manejar listas automáticamente).
    List<AlmacenDTO> toDTOList(List<Almacen> almacenList);

    List<Almacen> toEntityList(List<AlmacenDTO> almacenDTOList);
}