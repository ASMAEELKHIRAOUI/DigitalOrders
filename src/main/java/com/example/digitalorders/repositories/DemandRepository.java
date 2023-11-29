package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.EquipmentVIN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandRepository extends JpaRepository<Demand, Long> {
    List<Demand> getAllByEquipmentVINs(EquipmentVIN equipmentVIN);
}
