package com.base.project.controller;

import com.base.project.dto.request.CerrarCajaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cajas")
public class CajaController {

    @PostMapping("/cerrar")
    public ResponseEntity<String> cerrarCaja(@RequestBody CerrarCajaRequest cajaRequest) {

        return null;
    }
}
