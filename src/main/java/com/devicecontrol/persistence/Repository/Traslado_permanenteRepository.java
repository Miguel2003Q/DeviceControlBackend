package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Activo_Mobiliario;
import com.devicecontrol.persistence.entity.Traslado_permanente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Traslado_permanenteRepository extends JpaRepository<Traslado_permanente, Integer>{

    List<Traslado_permanente> findById_traslado_permanente(int id_traslado_permanente);
    List<Traslado_permanente> findByFecha_traslado(Date fecha_traslado);
    List<Traslado_permanente> findByEstado(String estado);
    List<Traslado_permanente> findById_traslado(String id_traslado);
}
