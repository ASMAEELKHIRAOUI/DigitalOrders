package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.Category;
import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.entities.Manufacturer;
import com.example.digitalorders.repositories.EquipmentRepository;
import com.example.digitalorders.service.CategoryService;
import com.example.digitalorders.service.EquipmentService;
import com.example.digitalorders.service.ManufacturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;
    private final CategoryService categoryService;
    private final ManufacturerService manufacturerService;

    @Override
    public Equipment save(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @Override
    public Equipment update(Long id, Equipment equipment) {
        Equipment existingEquipment = equipmentRepository.findById(id).orElse(null);

        if(existingEquipment != null){
            Category category = categoryService.getCategoryById(equipment.getCategory().getId());
            Manufacturer manufacturer = manufacturerService.getManufacturerById(equipment.getManufacturer().getId());

            existingEquipment.setName(equipment.getName());
            existingEquipment.setQuantity(equipment.getQuantity());
            existingEquipment.setPricePerDay(equipment.getPricePerDay());
            existingEquipment.setCategory(category);
            existingEquipment.setManufacturer(manufacturer);

            return equipmentRepository.save(existingEquipment);
        }
        return null;
    }

    @Override
    public List<Equipment> searchAvailableEquipments(LocalDateTime date) {
        return null;
    }

    @Override
    public boolean checkIfEquipmentExist(String name) {
        return false;
    }

    @Override
    public boolean checkIfCategoryExist(Category category) {
        return false;
    }
}
