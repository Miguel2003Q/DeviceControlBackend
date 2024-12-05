package com.devicecontrol.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Traslado_permanenteDTO {

    private int idTrasladoPermanente;
    private Date fechaTraslado;
    private String estado;
    private int idTraslado;

}