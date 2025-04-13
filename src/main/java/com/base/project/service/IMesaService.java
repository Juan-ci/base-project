package com.base.project.service;

import com.base.project.dto.request.MesaRequest;
import com.base.project.dto.response.MesaResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface IMesaService {

    MesaResponse cerrarMesa(@RequestBody MesaRequest mesaRequest);
}
