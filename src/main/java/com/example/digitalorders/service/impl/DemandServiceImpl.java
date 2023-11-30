package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.*;
import com.example.digitalorders.repositories.DemandRepository;
import com.example.digitalorders.service.DemandService;
import com.example.digitalorders.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DemandServiceImpl implements DemandService {

    private final DemandRepository demandRepository;
    private final UserService userService;
    @Override
    public Demand save(Demand demand) {
        List<EquipmentVIN> availableEquipments = new ArrayList<>();
        for (EquipmentVIN equipmentVIN : demand.getEquipmentVINs()){
            if (checkIfEquipmentIsAvailable(equipmentVIN, demand.getStartingDate(), demand.getEndingDate())){
                availableEquipments.add(equipmentVIN);
            }
        }
        demand.setEquipmentVINs(availableEquipments);
        return demandRepository.save(demand);
    }

    @Override
    public Demand update(Long id, Demand demand) {
        Demand existingDemand = demandRepository.findById(id).orElse(null);

        if(existingDemand != null){
            existingDemand.setStatus(demand.getStatus());
            return demandRepository.save(existingDemand);
        }
        return null;
    }

    @Override
    public Optional<Demand> findDemandById(Long id){
        return demandRepository.findById(id);
    }

    @Override
    public boolean checkIfEquipmentIsAvailable(EquipmentVIN equipmentVIN, LocalDateTime startingDate, LocalDateTime endingDate) {
        List<Demand> existingDemands = demandRepository.getAllByEquipmentVINs(equipmentVIN);

        for(Demand demands : existingDemands){
            LocalDateTime demandsStartingDate = demands.getStartingDate();
            LocalDateTime demandsEndingDate = demands.getEndingDate();

            if (startingDate.isAfter(demandsStartingDate) && endingDate.isBefore(demandsEndingDate)) {
                return false;
            }
        }
        return true;
    }

}
