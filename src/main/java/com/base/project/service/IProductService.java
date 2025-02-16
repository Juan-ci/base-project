package com.base.project.service;

import com.base.project.dto.ProductResponse;

import java.util.List;

public interface IProductService {

    List<ProductResponse> getAllProducts();
}