package com.base.project.service.impl;

import com.base.project.dto.response.ProductResponse;
import com.base.project.entity.Product;
import com.base.project.repository.IProductRepository;
import com.base.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private final IProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> productList = productRepository.findAll();

        return productList.stream()
                .map(product -> ProductResponse.builder()
                                    .idProduct(product.getIdProduct())
                                    .productName(product.getProductName())
                                    .productDescription(product.getProductDescription())
                        .productCategory(product.getProductCategory())
                                    .productPrice(product.getProductPrice())
                                    .build()
                )
                .toList();
    }

    @Override
    public List<ProductResponse> getProductsByCategory(String category) {
        return productRepository.findByProductCategory(category)
                .stream()
                .map(product -> ProductResponse.builder()
                        .idProduct(product.getIdProduct())
                        .productName(product.getProductName())
                        .productDescription(product.getProductDescription())
                        .productCategory(product.getProductCategory())
                        .productPrice(product.getProductPrice())
                        .build())
                .toList();
    }
}