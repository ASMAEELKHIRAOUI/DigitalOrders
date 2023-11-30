package com.example.digitalorders.service;

import com.example.digitalorders.entities.Contract;
import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.EquipmentVIN;

import java.util.List;

public interface ContractService {

    Contract save(Contract contract);

    Contract update(Long id, Contract contract);

}
