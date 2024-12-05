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
@Table(name = "TRASLADO_TEMPORAL")
public class Traslado_temporal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_traslado_temporal")
    private int id_traslado_temporal;

    @Column(name = "fecha_traslado")
    private Date fecha_traslado;

    @Column(name = "fecha_vencimiento")
    private Date fecha_vencimiento;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_traslado", nullable = false)
    private Traslado traslado;
}
