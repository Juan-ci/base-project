package com.base.project.service;

import com.base.project.dto.request.ProductoRequest;
import com.base.project.dto.response.ProductResponse;

import java.util.List;

public interface IProductService {

    List<ProductResponse> getAllProducts();

    List<ProductResponse> getProductsByCategory(String category);

    ProductResponse crearProducto(ProductoRequest productoRequest);
}