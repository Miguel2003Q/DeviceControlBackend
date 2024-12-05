package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activo_MobiliarioDTO {

    private int idMobiliario;
    private String tipoMobiliario;
    private String color;
    private String estado;
    private int idActivo; // Representa la referencia al ID de la entidad Activo
}

