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
@Table(name = "SOLICITUD")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private int id_solicitud;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ambiente", referencedColumnName = "id_ambiente")
    private Ambiente ambiente;

    @OneToMany(mappedBy = "id_solicitud_entrada", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Solicitud_entrada> solicitud_entrada;

    @OneToMany(mappedBy = "id_solicitud_salida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Solicitud_salida> solicitud_salida;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_instructor", referencedColumnName = "id")
    private Instructor instructor;

    @ManyToOne
    @JoinColumn(name = "id_seguridad", nullable = false)
    private Seguridad seguridad;
}
