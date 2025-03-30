package com.base.project.repository;

import com.base.project.entity.Caja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICajaRepository  extends CrudRepository<Caja, Long> {

    Caja findByIdCaja(Long idCaja);
}
