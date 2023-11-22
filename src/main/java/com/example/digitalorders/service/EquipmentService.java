package com.example.digitalorders.service;

import com.example.digitalorders.entities.Category;
import com.example.digitalorders.entities.Equipment;

import java.time.LocalDateTime;
import java.util.List;

public interface EquipmentService {

    Equipment saveEquipment(Equipment equipment);

    Equipment updateEquipment(Equipment equipment);

    List<Equipment> searchAvailableEquipment(LocalDateTime date);

    boolean checkIfEquipmentExist(String name);

    boolean checkIfCategoryExist(Category category);

}
