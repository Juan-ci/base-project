package com.base.project.controller;

import com.base.project.dto.request.MesaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    @PostMapping("/cerrar")
    public ResponseEntity<String> cerrarMesa(@RequestBody MesaRequest mesaRequest) {
        return null;
    }

    @GetMapping("/comprobantes/{idLocal}")
    public ResponseEntity<String> getComprobanteMesaPorFecha(@PathVariable("idLocal") Long idLocal,
                                                             @RequestParam("fecha") Date fecha) {
        return null;
    }
}
