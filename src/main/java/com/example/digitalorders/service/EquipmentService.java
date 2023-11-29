package com.example.digitalorders.service;

import com.example.digitalorders.entities.Category;
import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.entities.Manufacturer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

public interface EquipmentService {

    Equipment save(Equipment equipment);

    Equipment update(Long id, Equipment equipment);

    List<Equipment> searchAvailableEquipments(LocalDateTime date);

    boolean checkIfEquipmentExist(String name);

    boolean checkIfCategoryExist(Category category);

}
