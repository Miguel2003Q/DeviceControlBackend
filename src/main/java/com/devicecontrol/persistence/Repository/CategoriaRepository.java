package com.devicecontrol.persistence.Repository;


import com.devicecontrol.persistence.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    List<Categoria> findById_categoria(Integer id_categoria);
    List<Categoria> findByCategoria(String categoria);
    List<Categoria> findById_ambiente(Integer id_ambiente);
}
