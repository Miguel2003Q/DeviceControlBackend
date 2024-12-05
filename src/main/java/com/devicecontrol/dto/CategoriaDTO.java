package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {

    private int idCategoria;
    private String categoria;

    // En lugar de la lista de entidades Ambiente, se puede usar una lista de sus IDs u otra representación ligera.
    private List<Integer> idAmbientes;
}

