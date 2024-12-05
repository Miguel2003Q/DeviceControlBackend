package com.devicecontrol.persistence.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.devicecontrol.dto.ActivoDTO;
import com.devicecontrol.persistence.entity.Activo;
import com.devicecontrol.persistence.entity.Activo_Mobiliario;

@Mapper(componentModel = "spring")  // Esto le dice a MapStruct que registre el mapper como un bean de Spring
public interface ActivoMapper {
    
    // Convierte de Activo a ActivoDTO
    @Mapping(source = "id_activo", target = "idActivo")
    @Mapping(source = "almacen.id_almacen", target = "idAlmacen")
    @Mapping(source = "ambiente.id_ambiente", target = "idAmbiente")
    @Mapping(source = "activo_Mobiliario", target = "idActivoMobiliario", qualifiedByName = "mapMobiliarioToIds")
    ActivoDTO toDTO(Activo activo);

    // Convierte de ActivoDTO a Activo
    @Mapping(source = "idActivo", target = "id_activo")
    @Mapping(source = "idAlmacen", target = "almacen.id_almacen")
    @Mapping(source = "idAmbiente", target = "ambiente.id_ambiente")
    @Mapping(source = "idActivoMobiliario", target = "activo_Mobiliario", qualifiedByName = "mapIdsToMobiliario")
    Activo toEntity(ActivoDTO activoDTO);

    // Método auxiliar para convertir la lista de Activo_Mobiliario a una lista de IDs
    @Named("mapMobiliarioToIds")
    default List<Integer> mapMobiliarioToIds(List<Activo_Mobiliario> activoMobiliario) {
        return activoMobiliario.stream()
                .map(Activo_Mobiliario::getId_mobiliario)
                .collect(Collectors.toList());
    }

    // Método auxiliar para convertir una lista de IDs a una lista de Activo_Mobiliario
    @Named("mapIdsToMobiliario")
    default List<Activo_Mobiliario> mapIdsToMobiliario(List<Integer> ids) {
        return ids.stream()
                .map(id -> {
                    Activo_Mobiliario mobiliario = new Activo_Mobiliario();
                    mobiliario.setId_mobiliario(id);
                    return mobiliario;
                })
                .collect(Collectors.toList());
    }
}
