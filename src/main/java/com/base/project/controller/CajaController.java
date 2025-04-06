package com.base.project.controller;

import com.base.project.dto.request.CajaRequest;
import com.base.project.dto.response.CajaResponse;
import com.base.project.service.ICajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cajas")
public class CajaController {

    private final ICajaService cajaService;

    @Autowired
    public CajaController(ICajaService cajaService) {
        this.cajaService = cajaService;
    }

    @PostMapping("/abrir")
    public ResponseEntity<CajaResponse> abrirCaja(@RequestBody CajaRequest cajaRequest) {
        return new ResponseEntity<>(this.cajaService.abrirCaja(cajaRequest), HttpStatus.OK);
    }

    @PutMapping("/cerrar")
    public ResponseEntity<CajaResponse> cerrarCaja(@RequestBody CajaRequest cajaRequest) {
        return new ResponseEntity<>(this.cajaService.cerrarCaja(cajaRequest), HttpStatus.OK);
    }
}
