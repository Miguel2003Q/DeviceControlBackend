package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Ambiente;
import com.devicecontrol.persistence.entity.Traslado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrasladoRepository extends JpaRepository<Traslado, Integer> {

    List<Traslado> findById_traslado(int id_traslado);
    List<Traslado> findByEstado(String estado);
    List<Traslado> findById_traslado_temporal(int id_traslado_temporal);
    List<Traslado> findByDescripcion(int id_traslado_permanente);
}
