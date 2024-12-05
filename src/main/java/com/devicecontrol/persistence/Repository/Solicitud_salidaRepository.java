package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.crud.Solicitud_salidaCrudRepository;
import com.devicecontrol.persistence.entity.Activo;
import com.devicecontrol.persistence.entity.Solicitud_salida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface Solicitud_salidaRepository {

    List<Solicitud_salida> findById_solicitud_salida(int id_solicitud_salida);
    List<Solicitud_salida> findByDescripcion_solicitud(String descripcion_solicitud);
    List<Solicitud_salida> findByFecha(Date fecha);
    List<Solicitud_salida> findById_solicitud(int id_solicitud);
}
