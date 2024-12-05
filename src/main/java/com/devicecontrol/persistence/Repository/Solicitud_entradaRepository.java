package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Solicitud_entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Solicitud_entradaRepository extends JpaRepository<Solicitud_entrada, Integer> {

    List<Solicitud_entrada> findById_solicitud_entrada(int id_solicitud_entrada);
    List<Solicitud_entrada> findByDescripcion_solicitud(String descripcion_solicitud);
    List<Solicitud_entrada> findByFecha(Date fecha);
    List<Solicitud_entrada> findBySolicitudId(int id_solicitud);
}
