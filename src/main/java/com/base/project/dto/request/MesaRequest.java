package com.base.project.dto.request;

import com.base.project.entity.Product;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MesaRequest {

    private Long idMozo;

    private int numeroDeLaMesa;

    private Double dineroRecaudadoMesa;

    private Long idLocal;

    private int numeroDeSalon;

    private List<Product> productos;

    private Long cajaId;

    private Date fecha;
}
