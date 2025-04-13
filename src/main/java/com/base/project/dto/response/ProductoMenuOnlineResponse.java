package com.base.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoMenuOnlineResponse {

    private Long idProducto;

    private String nombreDelProducto;

    private Double precio;

    private int cantinad;
}
