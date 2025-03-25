package com.base.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductResponse {

    private Long idProduct;

    private String productName;

    private String productDescription;

    private Float productPrice;

    private String productCategory;
}