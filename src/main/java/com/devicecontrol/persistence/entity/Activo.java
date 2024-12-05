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
@Table(name = "ACTIVO")
public class Activo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_activo")
    private int id_activo;

    @ManyToOne
    @JoinColumn(name = "id_almacen", nullable = false)
    private Almacen almacen;

    @ManyToOne
    @JoinColumn(name = "id_ambiente", nullable = false)
    private Ambiente ambiente;

    @OneToMany(mappedBy = "id_mobiliario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activo_Mobiliario> activo_Mobiliario;
}
