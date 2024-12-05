package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Traslado;
import com.devicecontrol.persistence.entity.Usuario_ingresado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Usuario_ingresadoRepository extends JpaRepository<Usuario_ingresado, Integer> {
    List<Usuario_ingresado> findById_usuario_i(int id_usuario_i);
    List<Usuario_ingresado> findBynombre(String nombre);
    List<Usuario_ingresado> findBytelefono(int telefono);
    List<Usuario_ingresado> findByCorreo(String correo);
    List<Usuario_ingresado> findById_equipo(int id_equipo);

}
