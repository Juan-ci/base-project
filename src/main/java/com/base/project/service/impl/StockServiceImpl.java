package com.base.project.service.impl;

import com.base.project.repository.IStockRepository;
import com.base.project.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements IStockService {

    private final IStockRepository stockRepository;

    @Autowired
    public StockServiceImpl(IStockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
}
