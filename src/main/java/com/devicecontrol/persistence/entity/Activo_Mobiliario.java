package com.devicecontrol.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ACTIVO_MOBILIARIO")
public class Activo_Mobiliario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mobiliario")
    private int id_mobiliario;

    @Column(name = "tipo_mobiliario")
    private String tipo_mobiliario;

    @Column(name = "color")
    private String color;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_activo", nullable = false)
    private Activo activo;
}