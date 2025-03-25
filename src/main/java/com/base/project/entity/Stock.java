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
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_STOCK")
    private Long idStock;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "ID_PRODUCTO_PREPARADO")
    private Long idProductoPreparado;

    @Column(name = "STOCK_DISPONIBLE")
    private Double stockDisponible;

    @Column(name = "CANTIDAD_MINIMA_STOCK")
    private Double cantidadMinimaStock;

    @Column(name = "UNIDAD_MEDIDA_STOCK")
    private String unidadMedidaStock;

    private String imgProductoStock;

    @Column(name = "CATEGORIA_PRODUCTO_STOCK")
    private String categoriaProductoStock;
}
