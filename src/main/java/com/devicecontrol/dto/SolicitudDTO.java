package com.devicecontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudDTO {

    private int idSolicitud;
    private String descripcion;
    private AmbienteDTO ambiente;
    private List<Solicitud_entradaDTO> solicitudEntrada;
    private List<Solicitud_salidaDTO> solicitudSalida;
    private InstructorDTO instructor;
    private SeguridadDTO seguridad;
}
