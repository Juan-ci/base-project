package com.base.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PROVEEDOR")
    private Long idProveedor;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;

    @Column(name = "UNIDAD_MEDIDA_PRODUCTO")
    private String unidadMedidaProducto;

    @Column(name = "CANTIDAD_PRODUCTO")
    private Integer cantidadProducto;

    private String imgProducto;

    @Column(name = "NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    @Column(name = "PRECIO_PRODUCTO")
    private Float precioProducto;

    @Column(name = "CATEGORIA_PROVEEDOR")
    private String categoriaProveedor;

    @Column(name = "FECHA_COMPRA")
    private Date fechaCompra;
}
