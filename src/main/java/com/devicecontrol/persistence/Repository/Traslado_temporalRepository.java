package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Activo_Mobiliario;
import com.devicecontrol.persistence.entity.Traslado;
import com.devicecontrol.persistence.entity.Traslado_temporal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Traslado_temporalRepository extends JpaRepository<Traslado_temporal, Integer> {

    List<Traslado_temporal> findById_traslado_temporal(int id_traslado_temporal);
    List<Traslado_temporal> findByFecha_traslado(Date fecha_traslado);
    List<Traslado_temporal> findByFecha_vencimiento(Date fecha_vencimiento);
    List<Traslado_temporal> findByEstado(String estado);
    List<Traslado_temporal> findById_traslado(int id_traslado);
}
