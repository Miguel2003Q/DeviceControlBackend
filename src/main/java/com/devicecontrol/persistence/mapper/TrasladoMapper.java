package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devicecontrol.dto.TrasladoDTO;
import com.devicecontrol.persistence.entity.Traslado;
import com.devicecontrol.persistence.entity.Traslado_permanente;
import com.devicecontrol.persistence.entity.Traslado_temporal;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface TrasladoMapper {

    // Mapeo de Traslado a TrasladoDTO
    @Mapping(source = "id_traslado", target = "id_traslado")
    @Mapping(source = "estado", target = "estado")
    @Mapping(source = "traslado_permanente", target = "traslado_permanenteIds")
    @Mapping(source = "traslado_temporal", target = "traslado_temporalIds")
    @Mapping(source = "ambiente.id_ambiente", target = "id_ambiente")
    TrasladoDTO toDTO(Traslado traslado);

    // Mapeo de TrasladoDTO a Traslado
    @Mapping(source = "id_traslado", target = "id_traslado")
    @Mapping(source = "estado", target = "estado")
    @Mapping(source = "id_ambiente", target = "ambiente.id_ambiente")
    Traslado toEntity(TrasladoDTO trasladoDTO);

    // Métodos auxiliares para mapear listas de objetos a listas de IDs
    default List<Integer> mapTrasladoPermanente(List<Traslado_permanente> trasladoPermanenteList) {
        return trasladoPermanenteList.stream()
                                     .map(Traslado_permanente::getId_traslado_permanente)
                                     .collect(Collectors.toList());
    }

    default List<Integer> mapTrasladoTemporal(List<Traslado_temporal> trasladoTemporalList) {
        return trasladoTemporalList.stream()
                                   .map(Traslado_temporal::getId_traslado_temporal)
                                   .collect(Collectors.toList());
    }
}
