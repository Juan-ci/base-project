package com.base.project.service;

import com.base.project.dto.request.CajaRequest;
import com.base.project.dto.response.CajaResponse;

public interface ICajaService {

    CajaResponse abrirCaja(CajaRequest cajaRequest);

    CajaResponse cerrarCaja(CajaRequest cajaRequest);
}
