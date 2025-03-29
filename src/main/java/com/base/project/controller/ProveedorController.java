package com.base.project.controller;

import com.base.project.dto.request.ProveedorRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @GetMapping("/getAllProveedores")
    public ResponseEntity<String> getAllProveedores(@RequestParam("idLocal") Long idLocal) {
        return null;
    }

    @PutMapping("/updateProveedor/{idProveedor}")
    public ResponseEntity<String> updateProveedor(@PathVariable("idProveedor") Long idProveedor,
                                                  @RequestBody ProveedorRequest proveedorRequest) {
        return null;
    }

    @PostMapping("/createProveedor")
    public ResponseEntity<String> createProveedor(@RequestBody ProveedorRequest proveedorRequest) {
        return null;
    }

    @DeleteMapping("/deleteProveedor/{idProveedor}")
    public ResponseEntity<String> deleteProveedor(@PathVariable("idProveedor") Long idProveedor) {
        return null;
    }


}
