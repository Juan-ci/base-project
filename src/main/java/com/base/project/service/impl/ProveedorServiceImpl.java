package com.base.project.service.impl;

import com.base.project.repository.IProveedorRepository;
import com.base.project.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    private final IProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorServiceImpl(IProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }
}
