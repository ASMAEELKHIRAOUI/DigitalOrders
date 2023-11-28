package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.Contract;
import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.EquipmentVIN;
import com.example.digitalorders.service.ContractService;
import com.example.digitalorders.service.DemandService;

import java.time.LocalDateTime;
import java.util.List;

public class DemandServiceImpl implements DemandService {
    @Override
    public Demand saveDemand(Demand demand) {
        return null;
    }

    @Override
    public Demand updateDemand(Demand demand) {
        return null;
    }

    @Override
    public boolean checkIfEquipmentIsAvailable(EquipmentVIN equipmentVIN, LocalDateTime startingDate, LocalDateTime endingDate) {
        return false;
    }

}
