package com.base.project.repository;

import com.base.project.entity.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {

    List<Empleado> findAllByIdLocal(Long idLocal);
}
