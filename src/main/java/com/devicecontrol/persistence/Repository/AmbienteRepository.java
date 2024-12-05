package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Ambiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente, Integer> {

    List<Ambiente> findById_ambiente(int id_ambiente);
    List<Ambiente> findByEstado(String estado);
    List<Ambiente> findByNombreAmbiente(String nombre_ambiente);
    List<Ambiente> findByCapacidad(String capacidad);
    List<Ambiente> findByDescripcion(String descripcion);
    List<Ambiente> findByCategoria_IdCategoria(int id_categoria);
}
