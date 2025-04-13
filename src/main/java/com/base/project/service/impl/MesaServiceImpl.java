package com.base.project.service.impl;

import com.base.project.dto.request.MesaRequest;
import com.base.project.dto.response.MesaResponse;
import com.base.project.repository.IMesaRepository;
import com.base.project.service.IMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaServiceImpl implements IMesaService {

    private final IMesaRepository mesaRepository;

    @Autowired
    public MesaServiceImpl(IMesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    @Override
    public MesaResponse cerrarMesa(MesaRequest mesaRequest) {
        return null;
    }
}
