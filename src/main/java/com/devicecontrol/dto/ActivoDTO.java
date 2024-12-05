package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivoDTO {

    private int idActivo;
    private int idAlmacen; // Se usa el ID para evitar exponer objetos completos
    private int idAmbiente; // Se usa el ID para evitar exponer objetos completos
    private List<Integer> idActivoMobiliario; // Lista de IDs relacionados con Activo_Mobiliario
}
