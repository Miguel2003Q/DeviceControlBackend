package com.devicecontrol.persistence.crud;

import com.devicecontrol.persistence.entity.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorCrudRepository extends CrudRepository<Instructor, Integer> {

}
