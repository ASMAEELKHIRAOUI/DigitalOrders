package com.example.digitalorders.service;

import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.EquipmentVIN;

import java.time.LocalDateTime;
import java.util.Optional;

public interface DemandService {

    Demand save(Demand demand);

    Demand update(Long id, Demand demand);

    Optional<Demand> findDemandById(Long id);

    boolean checkIfEquipmentIsAvailable(EquipmentVIN equipmentVIN, LocalDateTime startingDate, LocalDateTime endingDate);

}
