package com.devicecontrol.controller;

import com.devicecontrol.dto.Activo_EquipoDTO;
import com.devicecontrol.service.Activo_EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activos")
public class Activo_EquipoController {

    @Autowired
    private Activo_EquipoService activoEquipoService;

    @GetMapping
    public List<Activo_EquipoDTO> getAllActivos() {
        return activoEquipoService.getAllActivos();
    }
}
