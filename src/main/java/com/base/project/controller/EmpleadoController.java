package com.base.project.controller;

import com.base.project.dto.request.EmpleadoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    //cambiar requestpara por pathvariable
    @GetMapping("/getAllEmpleadosByIdLocal")
    public ResponseEntity<String> getAllEmpleadosByLocal(@RequestParam("id_local") Long idLocal) {

        return null;
    }

    @PostMapping("/createEmpleado")
    public ResponseEntity<String> createEmpleado(@RequestBody EmpleadoRequest empleadoRequest) {

        return null;
    }

    @PutMapping("/updateEmpleado/{idEmpleado}")
    public ResponseEntity<String> updateEmpleado(@PathVariable("idEmpleado") Long idEmpleado) {
        return null;
    }
}
