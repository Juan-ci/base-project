package com.base.project.controller;

import com.base.project.dto.response.MenuOnlineResponse;
import com.base.project.dto.response.ProductoMenuOnlineResponse;
import com.base.project.service.IMenuOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menuOnline")
public class MenuOnlineController {

    private final IMenuOnlineService menuOnlineService;

    @Autowired
    public MenuOnlineController(IMenuOnlineService menuOnlineService) {
        this.menuOnlineService = menuOnlineService;
    }
    /**
     *
     * @param nombreLocal TO DO: CAMBIAR nombreLocal POR IDLOCAL???
     * @return
     */
    @GetMapping("/local/{nombreLocal}")
    public ResponseEntity<MenuOnlineResponse> getMenuOnline(@PathVariable("nombreLocal") String nombreLocal) {
        return new ResponseEntity<>(this.menuOnlineService.getMenuOnline(nombreLocal), HttpStatus.OK);
    }

    @GetMapping("/productos/{nombreLocal}")
    public ResponseEntity<List<ProductoMenuOnlineResponse>> getProductosByLocal(@PathVariable("nombreLocal") String nombreLocal) {
        return null;
    }
}
