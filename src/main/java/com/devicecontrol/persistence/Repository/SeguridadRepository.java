package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Seguridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeguridadRepository extends JpaRepository<Seguridad, Integer> {

    Optional<Seguridad> findById_seguridad(Integer id_seguridad);
}
