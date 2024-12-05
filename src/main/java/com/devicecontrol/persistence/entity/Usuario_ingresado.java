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
@Table(name = "USUARIO_INGRESADO")
public class Usuario_ingresado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_i")
    private int id_usuario_i;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "correo")
    private String correo;

    @OneToMany(mappedBy = "id_equipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activo_Equipo> activo_equipo;
}
