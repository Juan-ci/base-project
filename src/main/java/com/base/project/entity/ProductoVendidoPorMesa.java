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
public class ProductoVendidoPorMesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PRODUCTO_VENDIDO_POR_MESA")
    private Long idProductoVendidoPorMesa;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "ID_MESA")
    private Long idMesa;

    @Column(name = "ID_PRODUCTO")
    private Long idProducto;
}
