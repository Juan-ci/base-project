package com.base.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CAJA")
public class Caja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CAJA")
    private Long idCaja;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "NOMBRE_ENCARGADO")
    private String nombreEncargado;

    @Column(name = "NUMERO_SALON")
    private String numeroSalon;

    @Column(name = "HORA_APERTURA_CAJA")
    private Date horaAperturaCaja;

    @Column(name = "HORA_CIERRE_CAJA")
    private Date horaCierreCaja;

    @Column(name = "DINERO_RECAUDADO")
    private Double dineroRecaudado;

    @Column(name = "HORAS_TRABAJADAS_CAJA")
    private Date horasTrabajadasCaja;
}
