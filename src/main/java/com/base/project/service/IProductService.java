package com.base.project.service;

import com.base.project.dto.response.ProductResponse;

import java.util.List;

public interface IProductService {

    List<ProductResponse> getAllProducts();

    List<ProductResponse> getProductsByCategory(String category);
}