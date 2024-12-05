package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud_salidaDTO {

    private int idSolicitudSalida;
    private String descripcionSolicitud;
    private Date fecha;
    private int idSolicitud;
}