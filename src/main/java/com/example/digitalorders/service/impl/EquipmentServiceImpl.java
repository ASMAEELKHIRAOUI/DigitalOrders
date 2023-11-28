package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.Category;
import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.entities.Manufacturer;
import com.example.digitalorders.service.EquipmentService;

import java.time.LocalDateTime;
import java.util.List;

public class EquipmentServiceImpl implements EquipmentService {
    @Override
    public Equipment saveEquipment(Equipment equipment, Long category_id, Long manufacturer_id) {
        return null;
    }

    @Override
    public Equipment updateEquipment(Equipment equipment, Category category, Manufacturer manufacturer) {
        return null;
    }

    @Override
    public List<Equipment> searchAvailableEquipment(LocalDateTime date) {
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
