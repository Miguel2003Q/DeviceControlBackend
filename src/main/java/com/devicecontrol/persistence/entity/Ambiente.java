package com.devicecontrol.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "AMBIENTE")
public class Ambiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ambiente")
    private int id_ambiente;

    @Column(name = "nombre_ambiente")
    private String nombre_ambiente;

    @Column(name = "estado")
    private String estado;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "descripcion")
    private String descipcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "id_activo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activo> activo;

    @OneToMany(mappedBy = "id_traslado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Traslado> traslado;
}
