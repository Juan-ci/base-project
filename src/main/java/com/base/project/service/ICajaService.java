package com.base.project.service;

import com.base.project.dto.request.CerrarCajaRequest;
import com.base.project.dto.response.CajaResponse;

public interface ICajaService {

    CajaResponse cerrarCaja(CerrarCajaRequest cajaRequest);
}
