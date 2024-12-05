package com.devicecontrol.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devicecontrol.dto.AmbienteDTO;

@Service
public class AmbienteService {
    
    public List<AmbienteDTO> getAmbientes() {

        List<AmbienteDTO> ambientes = new ArrayList<>();

        ambientes.add(new AmbienteDTO(1, "Ambiente 1", "Activo", 20, "Descripción del ambiente 1", 101));
        ambientes.add(new AmbienteDTO(2, "Ambiente 2", "Inactivo", 25, "Descripción del ambiente 2", 102));
        ambientes.add(new AmbienteDTO(3, "Ambiente 3", "Activo", 30, "Descripción del ambiente 3", 103));
        ambientes.add(new AmbienteDTO(4, "Ambiente 4", "Activo", 15, "Descripción del ambiente 4", 104));
        ambientes.add(new AmbienteDTO(5, "Ambiente 5", "Inactivo", 50, "Descripción del ambiente 5", 105));
        ambientes.add(new AmbienteDTO(6, "Ambiente 6", "Activo", 10, "Descripción del ambiente 6", 106));
        ambientes.add(new AmbienteDTO(7, "Ambiente 7", "Inactivo", 35, "Descripción del ambiente 7", 107));
        ambientes.add(new AmbienteDTO(8, "Ambiente 8", "Activo", 40, "Descripción del ambiente 8", 108));
        ambientes.add(new AmbienteDTO(9, "Ambiente 9", "Activo", 45, "Descripción del ambiente 9", 109));
        ambientes.add(new AmbienteDTO(10, "Ambiente 10", "Inactivo", 60, "Descripción del ambiente 10", 110));
    
        return ambientes;
    }

    
}
