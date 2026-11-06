package com.mecanica.inventario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {
    @GetMapping("/api/v1/estado")
    public String estado(){
        return "API de inventario Activa";
    }
}
