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
@Table(name = "ALMACEN")
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_almacen")
    private int id_almacen;

    @OneToMany(mappedBy = "id_activo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activo> activo;

}
