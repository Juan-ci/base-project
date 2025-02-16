package com.base.project.service.impl;

import com.base.project.dto.ProductResponse;
import com.base.project.entity.Product;
import com.base.project.repository.IProductRepository;
import com.base.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> productList = productRepository.findAll();

        return productList.stream()
                .map(product -> ProductResponse.builder()
                                    .idProduct(product.getIdProduct())
                                    .productName(product.getProductName())
                                    .productDescription(product.getProductDescription())
                                    .productPrice(product.getProductPrice())
                                    .build()
                )
                .collect(Collectors.toList());
    }
}