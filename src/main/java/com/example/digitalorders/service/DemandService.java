package com.example.digitalorders.service;

import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.entities.EquipmentVIN;

import java.time.LocalDateTime;

public interface DemandService {

    Demand save(Demand demand);

    Demand update(Long id, Demand demand);

    boolean checkIfEquipmentIsAvailable(EquipmentVIN equipmentVIN, LocalDateTime startingDate, LocalDateTime endingDate);

}
