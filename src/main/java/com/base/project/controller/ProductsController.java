package com.base.project.controller;

import com.base.project.dto.request.ProductoRequest;
import com.base.project.dto.response.ProductResponse;
import com.base.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductsController {

    private final IProductService productService;

    @Autowired
    public ProductsController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/listar/{idLocal}")
    public ResponseEntity<List<ProductResponse>> getAllProducts(@PathVariable("idLocal") Long idLocal) {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> createProduct(@RequestBody ProductoRequest productoRequest) {
        return null;
    }

    @PutMapping("/editar/{idLocal}/{idProducto}")
    public ResponseEntity<String> updateProduct(@PathVariable("idLocal") Long idLocal,
                                                @PathVariable("idProducto") Long idProducto,
                                                @RequestBody ProductoRequest productoRequest) {
        return null;
    }

    @DeleteMapping("/eliminar/{idLocal}/{idProducto}")
    public ResponseEntity<String> deleteProduct(@PathVariable("idLocal") Long idLocal,
                                                @PathVariable("idProducto") Long idProducto) {
        return null;
    }

    @GetMapping("/getProductsByCategory/{category}")
    public ResponseEntity<List<ProductResponse>> getProductsByCategory(@PathVariable("category") String category) {
        return new ResponseEntity<>(productService.getProductsByCategory(category), HttpStatus.OK);
    }
}