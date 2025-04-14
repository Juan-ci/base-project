package com.base.project.controller;

import com.base.project.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    private final IStockService stockService;

    @Autowired
    public StockController(IStockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/getAllStock/{idLocal}")
    public ResponseEntity<String> getAllStock(@PathVariable("idLocal") Long idLocal) {
        return null;
    }
}
