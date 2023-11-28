package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.EquipmentVIN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentVINRepository  extends JpaRepository<EquipmentVIN, Long> {
    EquipmentVIN findEquipmentByVin(String vin);
}