package com.devicecontrol.controller;

import com.devicecontrol.dto.InstructorDTO;
import com.devicecontrol.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructores")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<InstructorDTO> getAllInstructores() {
        return instructorService.getInstructoresDTO();
    }
}
