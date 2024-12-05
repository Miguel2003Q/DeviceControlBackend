package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traslado_temporalDTO {

    private int idTrasladoTemporal;
    private Date fechaTraslado;
    private Date fechaVencimiento;
    private String estado;
    private int idTraslado; // Este es el id del objeto Traslado asociado

}
