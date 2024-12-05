package com.devicecontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devicecontrol.dto.AmbienteDTO;
import com.devicecontrol.service.AmbienteService;

@RestController
public class AmbienteController {

    @Autowired
    private AmbienteService ambienteService;

    @GetMapping("/ambientes")
    public List<AmbienteDTO> getAllAmbientes() {
        return ambienteService.getAmbientes();
    }
    
}
