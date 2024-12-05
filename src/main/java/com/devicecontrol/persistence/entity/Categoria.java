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
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int id_categoria;

    @Column(name = "categoria")
    private String categoria;

    @OneToMany(mappedBy = "id_ambiente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ambiente> id_ambiente;
}
