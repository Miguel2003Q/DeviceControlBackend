package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

    List<Solicitud> findById_solicitud(Integer id_solicitud);
    List<Solicitud> findByDescripcion(String descripcion);
    List<Solicitud> findById_ambiente(Integer id_ambiente);
    List<Solicitud> findById_solicitud_entrada(Integer id_solicitud_entrada);
    List<Solicitud> findById_solicitud_salida(Integer id_solicitud_salida);
    List<Solicitud> findById_instructor(Integer id_instructor);
    List<Solicitud> findById_seguridad(Integer id_seguridad);
}
