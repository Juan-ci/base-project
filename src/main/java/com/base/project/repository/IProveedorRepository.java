package com.base.project.repository;

import com.base.project.entity.Proveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedorRepository extends CrudRepository<Proveedor, Long> {
}
