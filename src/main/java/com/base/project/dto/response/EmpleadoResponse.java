package com.base.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpleadoResponse {

    private Long idEmpleado;

    private Long idLocal;

    private String rol;

    private String nombreEmpleado;
}
