package com.base.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "EMPLEADO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_EMPLEADO")
    private Long idEmpleado;

    @Column(name = "ID_LOCAL")
    private Long idLocal;

    @Column(name = "ROL")
    private String rol;

    @Column(name = "NOMBRE_EMPLEADO")
    private String nombreEmpleado;
}
