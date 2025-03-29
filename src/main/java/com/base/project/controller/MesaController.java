package com.base.project.controller;

import com.base.project.dto.request.MesaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
