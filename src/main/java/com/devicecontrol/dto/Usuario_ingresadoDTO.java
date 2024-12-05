package com.devicecontrol.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario_ingresadoDTO {

    private int id_usuario_i;
    private String nombre;
    private int telefono;
    private String correo;

    private List<Activo_EquipoDTO> activo_equipo;
}
