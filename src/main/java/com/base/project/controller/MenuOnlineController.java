package com.base.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menuOnline")
public class MenuOnlineController {
    /**
     *
     * @param nombreLocal TO DO: CAMBIAR nombreLocal POR IDLOCAL???
     * @return
     */
    @GetMapping("/getMenuOnline/{nombreLocal}")
    public ResponseEntity<String> getMenuOnline(@PathVariable("nombreLocal") String nombreLocal) {
        return null;
    }

    @GetMapping("/getProductosByLocal/{nombreLocal}")
    public ResponseEntity<String> getProductosByLocal(@PathVariable("nombreLocal") String nombreLocal) {
        return null;
    }
}
