package com.devicecontrol.persistence.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.devicecontrol.dto.CategoriaDTO;
import com.devicecontrol.persistence.entity.Ambiente;
import com.devicecontrol.persistence.entity.Categoria;

@Mapper
public interface CategoriaMapper {
    
    // Convierte de Categoria a CategoriaDTO
    @Mapping(source = "id_categoria", target = "idCategoria")
    @Mapping(source = "id_ambiente", target = "idAmbientes", qualifiedByName = "mapAmbientesToIds")
    CategoriaDTO toDTO(Categoria categoria);

    // Convierte de CategoriaDTO a Categoria
    @Mapping(source = "idCategoria", target = "id_categoria")
    @Mapping(source = "idAmbientes", target = "id_ambiente", ignore = true) // Ignoramos la lista porque no tenemos objetos completos
    Categoria toEntity(CategoriaDTO categoriaDTO);

    // Método auxiliar para convertir List<Ambiente> a List<Integer>
    @Named("mapAmbientesToIds")
    default List<Integer> mapAmbientesToIds(List<Ambiente> ambientes) {
        if (ambientes == null) {
            return null;
        }
        return ambientes.stream()
                .map(Ambiente::getId_ambiente) // Obtener el ID de cada Ambiente
                .collect(Collectors.toList());
    }
}
