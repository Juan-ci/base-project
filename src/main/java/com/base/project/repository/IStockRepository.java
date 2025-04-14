package com.base.project.repository;

import com.base.project.entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockRepository extends CrudRepository<Stock, Long> {
}
