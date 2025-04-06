package com.base.project.service.impl;

import com.base.project.dto.request.CajaRequest;
import com.base.project.dto.response.CajaResponse;
import com.base.project.entity.Caja;
import com.base.project.repository.ICajaRepository;
import com.base.project.service.ICajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CajaServiceImpl implements ICajaService {

    private final ICajaRepository cajaRepository;

    @Autowired
    public CajaServiceImpl(ICajaRepository cajaRepository) {
        this.cajaRepository = cajaRepository;
    }

    @Override
    public CajaResponse abrirCaja(CajaRequest cajaRequest) {
        Caja cajaEntity = this.cajaRepository.save(this.requestToEntity(cajaRequest));

        return this.entityToResponse(cajaEntity);
    }

    @Override
    public CajaResponse cerrarCaja(CajaRequest cajaRequest) {
        boolean existCaja = this.cajaRepository.existsById(cajaRequest.getIdCaja());

        if (existCaja) {
            Caja cajaEntity = this.requestToEntity(cajaRequest);

            this.cajaRepository.save(cajaEntity);

            return this.entityToResponse(cajaEntity);
        }

        return null;
    }

    private Caja requestToEntity(CajaRequest cajaRequest) {
        return Caja.builder()
                .idCaja(cajaRequest.getIdCaja())
                .idLocal(cajaRequest.getIdLocal())
                .horaAperturaCaja(cajaRequest.getHorarioApertura())
                .horaCierreCaja(cajaRequest.getHoraCierre())
                .horasTrabajadasCaja(cajaRequest.getHorasTrabajadas())
                .dineroRecaudado(cajaRequest.getDineroRecaudado())
                .nombreEncargado(cajaRequest.getEncargado())
                .numeroSalon(cajaRequest.getNumeroSalon())
                .build();
    }

    private CajaResponse entityToResponse(Caja cajaEntity) {
        return CajaResponse.builder()
                .idCaja(cajaEntity.getIdCaja())
                .idLocal(cajaEntity.getIdLocal())
                .horaAperturaCaja(cajaEntity.getHoraAperturaCaja())
                .horaCierreCaja(cajaEntity.getHoraCierreCaja())
                .horasTrabajadasCaja(cajaEntity.getHorasTrabajadasCaja())
                .dineroRecaudado(cajaEntity.getDineroRecaudado())
                .nombreEncargado(cajaEntity.getNombreEncargado())
                .numeroSalon(cajaEntity.getNumeroSalon())
                .build();
    }
}
