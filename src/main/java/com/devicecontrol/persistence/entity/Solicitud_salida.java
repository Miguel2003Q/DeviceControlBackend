package com.devicecontrol.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "SOLICITUD_SALIDA")
public class Solicitud_salida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_salida")
    private int id_solicitud_salida;

    @Column(name = "descripcion_solicitud")
    private String descripcion_solicitud;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_solicitud", nullable = false)
    private Solicitud solicitud;
}
