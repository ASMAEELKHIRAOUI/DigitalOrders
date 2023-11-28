package com.example.digitalorders.service;

import com.example.digitalorders.entities.Category;
import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.entities.Manufacturer;

import java.time.LocalDateTime;
import java.util.List;

public interface EquipmentService {

    Equipment saveEquipment(Equipment equipment, Long category_id, Long manufacturer_id);

    Equipment updateEquipment(Equipment equipment, Category category, Manufacturer manufacturer);

    List<Equipment> searchAvailableEquipment(LocalDateTime date);

    boolean checkIfEquipmentExist(String name);

    boolean checkIfCategoryExist(Category category);

}
