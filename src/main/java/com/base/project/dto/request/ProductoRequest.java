package com.base.project.dto.request;

import lombok.Data;

@Data
public class ProductoRequest {

    private String nombreProductoPreparado;

    private String categoriaProductoPreparado;

    private String subcategoriaProductoPreparado;

    private String tipoProductoPreparado;

    private String detallesProductoPreparado;

    //chequear esto
    private String imgProductoPreparado;

    private Double precioProducto;

    private Long idLocal;
}
