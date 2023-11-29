package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.Manufacturer;
import com.example.digitalorders.repositories.ManufacturerRepository;
import com.example.digitalorders.service.ManufacturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    @Override
    public Manufacturer getManufacturerById(Long id) {
        return manufacturerRepository.getManufacturerById(id);
    }
}
