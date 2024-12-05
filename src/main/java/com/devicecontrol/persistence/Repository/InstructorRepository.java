package com.devicecontrol.persistence.Repository;

import com.devicecontrol.persistence.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

    List<Instructor> findById_instructor(Integer id_instructor);
    List<Instructor> findByNombreInstructor(String nombreInstructor);
}
