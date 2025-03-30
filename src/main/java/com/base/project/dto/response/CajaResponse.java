package com.base.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CajaResponse {

    private Long idCaja;

    private Long idLocal;

    private String nombreEncargado;

    private String numeroSalon;

    private Date horaAperturaCaja;

    private Date horaCierreCaja;

    private Double dineroRecaudado;

    private Date horasTrabajadasCaja;
}
