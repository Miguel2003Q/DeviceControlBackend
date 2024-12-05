package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmbienteDTO {

    private int idAmbiente;
    private String nombreAmbiente;
    private String estado;
    private int capacidad;
    private String descripcion;
    private int idCategoria;
}