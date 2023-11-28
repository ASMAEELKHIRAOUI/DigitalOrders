package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository  extends JpaRepository<Equipment, Long> {
    List<Equipment> findAllByName(String modelName);

    List<Equipment> findAllByIdIn( List<Long> ids);

}
