package com.example.digitalorders.service;

import com.example.digitalorders.entities.Contract;
import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.EquipmentVIN;

import java.util.List;

public interface ContractService {

    Contract createContract(Demand demand, List<EquipmentVIN> equipmentVIN);

    Contract updateContract(Contract contract);

}
