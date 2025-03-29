package com.base.project.dto.request;

import lombok.Data;

@Data
public class ProveedorRequest {

    private Long idLocal;

    private String nombreProductoProveedor;

    private String unidadMedidaProducto;

    private Float cantidadProducto;

    private String imgProducto;

    private String nombreProveedor;

    private Double precioProducto;

    private String categoriaProveedor;
}
