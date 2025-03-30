package com.base.project.controller;

import com.base.project.dto.request.CerrarCajaRequest;
import com.base.project.service.ICajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cajas")
public class CajaController {

    private ICajaService cajaService;

    @Autowired
    public CajaController(ICajaService cajaService) {
        this.cajaService = cajaService;
    }

    @PutMapping("/cerrar")
    public ResponseEntity<String> cerrarCaja(@RequestBody CerrarCajaRequest cajaRequest) {
        return null;
    }
}
