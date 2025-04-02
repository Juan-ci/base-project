package com.base.project.controller;

import com.base.project.dto.request.EmpleadoRequest;
import com.base.project.dto.response.EmpleadoResponse;
import com.base.project.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private final IEmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(IEmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/getAllEmpleadosByIdLocal/{idLocal}")
    public ResponseEntity<List<EmpleadoResponse>> getAllEmpleadosByLocal(@PathVariable("idLocal") Long idLocal) {
        return new ResponseEntity<>(this.empleadoService.getAllEmpleados(idLocal), HttpStatus.OK);
    }

    @PostMapping("/createEmpleado")
    public ResponseEntity<EmpleadoResponse> createEmpleado(@RequestBody EmpleadoRequest empleadoRequest) {
        return new ResponseEntity<>(empleadoService.createEmpleado(empleadoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateEmpleado/{idEmpleado}")
    public ResponseEntity<EmpleadoResponse> updateEmpleado(@PathVariable("idEmpleado") Long idEmpleado,
                                                           @RequestBody EmpleadoRequest empleadoRequest) {
        return new ResponseEntity<>(this.empleadoService.updateEmpleado(idEmpleado, empleadoRequest), HttpStatus.OK);
    }
}