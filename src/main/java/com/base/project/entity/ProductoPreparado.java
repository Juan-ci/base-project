package com.base.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ProductoPreparado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PRODUCTO_PREPARADO")
    private Long idProductoPreparado;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "ID_INGREDIENTE")
    private Long idIngrediente;

    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;

    @Column(name = "CATEGORIA_PRODUCTO")
    private String categoriaProducto;

    @Column(name = "SUBCATEGORIA_PRODUCTO")
    private String subcategoriaProducto;

    @Column(name = "TIPO_PRODUCTO")
    private String tipoProducto;

    @Column(name = "DETALLE_PRODUCTO_PREPARADO")
    private String detalleProductoPreparado;

    @Column(name = "PRECIO_PRODUCTO")
    private Double precioProducto;

    //REVISAR VER IMG PRODUCTO
    private String imgProducto;

    @Column(name = "IS_AVAILABLE")
    private boolean isAvailable;
}
