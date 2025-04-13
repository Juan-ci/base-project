package com.base.project.dto.response;

import com.base.project.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MesaResponse {

    private Long idMozo;

    private int numeroMesa;

    private Double dineroRecaudadoMesa;

    private Long idLocal;

    private int numeroSalon;

    private List<Product> productos;

    private Long idCaja;

    private Date fecha;
}
