package com.base.project.controller;

import com.base.project.dto.request.ProveedorRequest;
import com.base.project.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    private final IProveedorService proveedorService;

    @Autowired
    public ProveedorController(IProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

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