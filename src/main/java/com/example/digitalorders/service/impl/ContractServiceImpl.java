package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.Contract;
import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.enums.Status;
import com.example.digitalorders.repositories.ContractRepository;
import com.example.digitalorders.service.ContractService;
import com.example.digitalorders.service.DemandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;
    private final DemandService demandService;

    @Override
    public Contract save(Contract contract) {
        Demand demand = demandService.findDemandById(contract.getDemand().getId()).get();
        if(demand.getStatus() == Status.Accepted){
            return contractRepository.save(contract);
        }

        return null;
    }

    @Override
    public Contract update(Long id, Contract contract) {
        Contract existingContract = contractRepository.findById(id).orElse(null);

        if(existingContract != null){
            existingContract.setStatus(contract.getStatus());
            return contractRepository.save(existingContract);
        }
        return null;
    }
}
