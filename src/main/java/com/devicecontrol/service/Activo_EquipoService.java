package com.devicecontrol.service;

import com.devicecontrol.dto.Activo_EquipoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activo_EquipoService {

    public List<Activo_EquipoDTO> getAllActivos() {
        return List.of(
            new Activo_EquipoDTO(1, "Laptop", "Dell", "XPS 13", "Negro", 1, 1),
            new Activo_EquipoDTO(2, "Tablet", "Apple", "iPad Pro", "Gris", 2, 2),
            new Activo_EquipoDTO(3, "Smartphone", "Samsung", "Galaxy S23", "Azul", 3, 3),
            new Activo_EquipoDTO(4, "Monitor", "LG", "UltraWide", "Negro", 4, 4),
            new Activo_EquipoDTO(5, "Teclado", "Logitech", "K780", "Blanco", 5, 5),
            new Activo_EquipoDTO(6, "Mouse", "Razer", "DeathAdder", "Negro", 6, 6),
            new Activo_EquipoDTO(7, "Router", "Netgear", "Nighthawk", "Negro", 7, 7),
            new Activo_EquipoDTO(8, "Cámara", "Canon", "EOS 80D", "Negro", 8, 8),
            new Activo_EquipoDTO(9, "Auriculares", "Sony", "WH-1000XM5", "Negro", 9, 9),
            new Activo_EquipoDTO(10, "Impresora", "HP", "LaserJet Pro", "Blanco", 10, 10)
        );
    }
}
