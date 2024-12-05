package com.devicecontrol.service;

import com.devicecontrol.dto.Activo_MobiliarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activo_MobiliarioService {

    public List<Activo_MobiliarioDTO> getAllMobiliario() {
        return List.of(
            new Activo_MobiliarioDTO(1, "Escritorio", "Madera", "Bueno", 1),
            new Activo_MobiliarioDTO(2, "Silla", "Negro", "Nuevo", 2),
            new Activo_MobiliarioDTO(3, "Mesa", "Vidrio", "Usado", 3),
            new Activo_MobiliarioDTO(4, "Estantería", "Blanco", "Nuevo", 4),
            new Activo_MobiliarioDTO(5, "Cajonera", "Madera", "Bueno", 5),
            new Activo_MobiliarioDTO(6, "Lámpara", "Blanco", "Bueno", 6),
            new Activo_MobiliarioDTO(7, "Silla de oficina", "Gris", "Nuevo", 7),
            new Activo_MobiliarioDTO(8, "Pizarra", "Blanco", "Nuevo", 8),
            new Activo_MobiliarioDTO(9, "Taburete", "Madera", "Usado", 9),
            new Activo_MobiliarioDTO(10, "Banco", "Gris", "Bueno", 10)
        );
    }
}
