package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activo_EquipoDTO {

    private int idEquipo;
    private String tipoActivo;
    private String marca;
    private String modelo;
    private String color;
    private int idActivo; // Referencia al id de Activo
    private int idUsuarioIngresado; // Referencia al id de Usuario_ingresado
}

