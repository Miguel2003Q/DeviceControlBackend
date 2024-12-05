package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud_entradaDTO {

    private int idSolicitudEntrada;
    private String descripcion;
    private Date fecha;
    private int idSolicitud;
}
