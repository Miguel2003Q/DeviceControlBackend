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
@Table(name = "TRASLADO_PERMANENTE")
public class Traslado_permanente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_traslado_permanente")
    private int id_traslado_permanente;

    @Column(name = "fecha_traslado")
    private Date fecha_traslado;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_traslado", nullable = false)
    private Traslado traslado;
}
