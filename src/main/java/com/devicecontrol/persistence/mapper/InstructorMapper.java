package com.devicecontrol.persistence.mapper;

import org.mapstruct.Mapper;

import com.devicecontrol.dto.InstructorDTO;
import com.devicecontrol.persistence.entity.Instructor;

@Mapper
public interface InstructorMapper {
    
    // Convierte de Instructor a InstructorDTO
    InstructorDTO toDTO(Instructor instructor);

    // Convierte de InstructorDTO a Instructor
    Instructor toEntity(InstructorDTO instructorDTO);
}
