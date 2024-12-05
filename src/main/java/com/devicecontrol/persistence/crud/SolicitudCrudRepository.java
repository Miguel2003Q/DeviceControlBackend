package com.devicecontrol.persistence.crud;

import com.devicecontrol.persistence.entity.Solicitud;
import org.springframework.data.repository.CrudRepository;

public interface SolicitudCrudRepository extends CrudRepository<Solicitud, Integer> {

}
