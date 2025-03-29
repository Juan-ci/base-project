package com.base.project.dto.request;

import com.base.project.entity.Product;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MesaRequest {
    private Long idMozo;

    private int numeroMesa;

    private Double dineroRecaudadoMesa;

    private Long idLocal;

    private int numeroSalon;

    private List<Product> productos;

    private Long idCaja;

    private Date fecha;
}
