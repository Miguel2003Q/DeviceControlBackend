package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.Activo_MobiliarioDTO;
import com.devicecontrol.persistence.entity.Activo_Mobiliario;

@Mapper
public interface Activo_MobiliarioMapper {
    
    // Convierte de Activo_Mobiliario a Activo_MobiliarioDTO
    @Mapping(source = "id_mobiliario", target = "idMobiliario")
    @Mapping(source = "tipo_mobiliario", target = "tipoMobiliario")
    @Mapping(source = "activo.id_activo", target = "idActivo")
    Activo_MobiliarioDTO toDTO(Activo_Mobiliario activoMobiliario);

    // Convierte de Activo_MobiliarioDTO a Activo_Mobiliario
    @Mapping(source = "idMobiliario", target = "id_mobiliario")
    @Mapping(source = "tipoMobiliario", target = "tipo_mobiliario")
    @Mapping(source = "idActivo", target = "activo.id_activo")
    Activo_Mobiliario toEntity(Activo_MobiliarioDTO activoMobiliarioDTO);
}
