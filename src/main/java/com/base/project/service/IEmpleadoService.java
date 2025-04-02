package com.base.project.service;

import com.base.project.dto.request.EmpleadoRequest;
import com.base.project.dto.response.EmpleadoResponse;

import java.util.List;

public interface IEmpleadoService {

    EmpleadoResponse createEmpleado(EmpleadoRequest empleadoRequest);

    List<EmpleadoResponse> getAllEmpleados(Long idLocal);

    EmpleadoResponse updateEmpleado(Long idEmpleado, EmpleadoRequest empleadoRequest);
}
