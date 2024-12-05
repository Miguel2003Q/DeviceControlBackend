package com.devicecontrol.persistence.Repository;


import com.devicecontrol.persistence.entity.Activo;
import com.devicecontrol.persistence.entity.Almacen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Integer> {

    List<Almacen> findByAlmacen_IdAlmacen(Integer id_almacen);

}
