package com.base.project.controller;

import com.base.project.dto.response.ProductResponse;
import com.base.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductsController {

    private final IProductService productService;

    @Autowired
    public ProductsController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/getProductsByCategory/{category}")
    public ResponseEntity<List<ProductResponse>> getProductsByCategory(@PathVariable("category") String category) {
        return new ResponseEntity<>(productService.getProductsByCategory(category), HttpStatus.OK);
    }
}