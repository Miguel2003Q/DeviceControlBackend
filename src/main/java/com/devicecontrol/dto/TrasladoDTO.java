package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrasladoDTO {

    private int id_traslado;
    private String estado;
    private List<Integer> traslado_permanenteIds; // Solo los IDs de Traslado_permanente
    private List<Integer> traslado_temporalIds; // Solo los IDs de Traslado_temporal
    private int id_ambiente; // El ID del Ambiente asociado

}
