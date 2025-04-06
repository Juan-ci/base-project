package com.base.project.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class CajaRequest {

    private Long idCaja;

    private Long idLocal;

    private String numeroSalon;

    private String encargado;

    private Date horarioApertura;

    private Date horaCierre;

    private Double dineroRecaudado;

    private String dia;

    private String mes;

    private Date horasTrabajadas;
}
