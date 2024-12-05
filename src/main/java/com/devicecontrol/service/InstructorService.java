//Para hacer lo de Angarita

package com.devicecontrol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devicecontrol.dto.InstructorDTO;

@Service
public class InstructorService {
    
    List<InstructorDTO> instructores = List.of(
    new InstructorDTO(1, "Juan Pérez"),
    new InstructorDTO(2, "Ana González"),
    new InstructorDTO(3, "Carlos Rodríguez"),
    new InstructorDTO(4, "María López"),
    new InstructorDTO(5, "Luis Martínez"),
    new InstructorDTO(6, "Patricia Sánchez"),
    new InstructorDTO(7, "David Torres"),
    new InstructorDTO(8, "Elena Díaz"),
    new InstructorDTO(9, "Miguel Fernández"),
    new InstructorDTO(10, "Sofía García")
);

    public List<InstructorDTO> getInstructoresDTO() {
        return instructores;
    }
}
