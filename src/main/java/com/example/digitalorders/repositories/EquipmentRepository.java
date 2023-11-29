package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository  extends JpaRepository<Equipment, Long> {
    List<Equipment> findAllByName(String modelName);

    List<Equipment> findAllByIdIn( List<Long> ids);

}
