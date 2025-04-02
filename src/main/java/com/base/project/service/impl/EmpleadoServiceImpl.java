package com.base.project.service.impl;

import com.base.project.dto.request.EmpleadoRequest;
import com.base.project.dto.response.EmpleadoResponse;
import com.base.project.entity.Empleado;
import com.base.project.repository.IEmpleadoRepository;
import com.base.project.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    private final IEmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoServiceImpl(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public EmpleadoResponse createEmpleado(EmpleadoRequest empleadoRequest) {
        Empleado empleadoEntity = this.requestToEntity(empleadoRequest);

        empleadoEntity = this.empleadoRepository.save(empleadoEntity);

        return this.entityToResponse(empleadoEntity);
    }

    @Override
    public List<EmpleadoResponse> getAllEmpleados(Long idLocal) {
        List<Empleado> empleadosEntityList = (List<Empleado>) this.empleadoRepository.findAllByIdLocal(idLocal);
        return empleadosEntityList.stream()
                .map(this::entityToResponse)
                .toList();
    }

    @Override
    public EmpleadoResponse updateEmpleado(Long idEmpleado, EmpleadoRequest empleadoRequest) {
       boolean existEmpleado = this.empleadoRepository.existsById(idEmpleado);

       if (existEmpleado) {
            Empleado empleadoEntity = this.requestToEntity(empleadoRequest);
            empleadoEntity.setIdEmpleado(idEmpleado);

            this.empleadoRepository.save(empleadoEntity);
       }

       return null;
    }

    private Empleado requestToEntity(EmpleadoRequest empleadoRequest) {
        return Empleado.builder()
                .idLocal(empleadoRequest.getIdLocal())
                .rol("EMPLEADO")
                .nombreEmpleado(empleadoRequest.getNombreEmpleado())
                .build();
    }

    private EmpleadoResponse entityToResponse(Empleado empleadoEntity) {
        return EmpleadoResponse.builder()
                .idEmpleado(empleadoEntity.getIdEmpleado())
                .idLocal(empleadoEntity.getIdLocal())
                .rol(empleadoEntity.getRol())
                .nombreEmpleado(empleadoEntity.getNombreEmpleado())
                .build();
    }
}
