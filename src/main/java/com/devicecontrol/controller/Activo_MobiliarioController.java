package com.devicecontrol.controller;

import com.devicecontrol.dto.Activo_MobiliarioDTO;
import com.devicecontrol.service.Activo_MobiliarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Activo_MobiliarioController {

    @Autowired
    private Activo_MobiliarioService activoMobiliarioService;

    @GetMapping("/mobiliario")
    public List<Activo_MobiliarioDTO> getAllMobiliario() {
        return activoMobiliarioService.getAllMobiliario();
    }
}
