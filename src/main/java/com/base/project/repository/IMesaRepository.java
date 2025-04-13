package com.base.project.repository;

import com.base.project.entity.Mesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMesaRepository extends CrudRepository<Mesa, Long> {
}
