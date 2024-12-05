package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Activo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivoRepository extends JpaRepository<Activo, Integer> {

    List<Activo> findByAlmacen_IdAlmacen(Integer id_almacen);
    List<Activo> findByActivo_Mobiliario_IdMobiliario(Integer id_mobiliario);
    List<Activo> findByActivo_Equipo_IdEquipo(Integer id_equipo);
}
