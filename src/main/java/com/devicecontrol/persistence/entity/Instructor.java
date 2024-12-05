package com.devicecontrol.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "INSTRUCTOR")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instructor")
    private int id_instructor;

    @Column(name = "nombre_instructor")
    private String nombre_instructor;

}
