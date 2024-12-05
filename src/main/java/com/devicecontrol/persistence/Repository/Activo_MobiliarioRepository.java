package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Activo_Mobiliario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Activo_MobiliarioRepository extends JpaRepository<Activo_Mobiliario, Integer> {

    List<Activo_Mobiliario> findById_Mobiliario(String id_mobiliario);
    List<Activo_Mobiliario> findByTipoMobiliario(String tipoMobiliario);
    List<Activo_Mobiliario> findByColor(String color);
    List<Activo_Mobiliario> findByEstado(String estado);
}