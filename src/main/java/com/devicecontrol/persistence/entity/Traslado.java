package com.devicecontrol.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TRASLADO")
public class Traslado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_traslado")
    private int id_traslado;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "id_traslado_permanente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Traslado_permanente> traslado_permanente;

    @OneToMany(mappedBy = "id_traslado_temporal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Traslado_temporal> traslado_temporal;

    @ManyToOne
    @JoinColumn(name = "id_ambiente", nullable = false)
    private Ambiente ambiente;

}
