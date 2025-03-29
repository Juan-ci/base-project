package com.base.project.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class CerrarCajaRequest {

    private Long idCaja;

    private Long idLocal;

    private int numeroSalon;

    private String encargado;

    private Date horarioApertura;

    private Date horaCierre;

    private Double dinero;

    private String dia;

    private String mes;
}
