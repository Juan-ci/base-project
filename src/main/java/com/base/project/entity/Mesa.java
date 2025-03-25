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
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MESA")
    private Long idMesa;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "NUMERO_SALON")
    private String numeroSalon;

    @Column(name = "NUMERO_MESA")
    private String numeroMesa;

    @Column(name = "NOMBRE_MOZO")
    private String nombreMozo;

    @Column(name = "DINERO_RECAUDADO_MESA")
    private Double dineroRecaudadoMesa;
}
