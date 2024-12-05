package com.devicecontrol.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ACTIVO_EQUIPO")
public class Activo_Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private int id_equipo;

    @Column(name = "tipo_activo")
    private String tipo_activo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "id_activo", nullable = false)
    private Activo activo;

    @ManyToOne
    @JoinColumn(name = "id_usuario_i", nullable = false)
    private Usuario_ingresado usuario_ingresado;
}

