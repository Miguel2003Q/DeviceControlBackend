package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Activo_Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Activo_EquipoRepository extends JpaRepository<Activo_Equipo, Integer> {

    List<Activo_Equipo> findById_Activo_Equipo(Integer id_activo_equipo);
    List<Activo_Equipo> findByTipoActivo(String tipo_activo);
    List<Activo_Equipo> findByMarca(String marca);
    List<Activo_Equipo> findByModelo(String modelo);
    List<Activo_Equipo> findByColor(String color);
}
