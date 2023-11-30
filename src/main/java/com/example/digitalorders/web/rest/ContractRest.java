package com.example.digitalorders.web.rest;

import com.example.digitalorders.entities.Contract;
import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.service.ContractService;
import com.example.digitalorders.service.DemandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contract")
public class ContractRest {

    private final ContractService contractService;

    @PostMapping
    public ResponseEntity<Contract> save(@Valid @RequestBody Contract contract){
        return new ResponseEntity<>(contractService.save(contract), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contract> save(@PathVariable Long id,@Valid @RequestBody Contract contract){
        return new ResponseEntity<>(contractService.update(id, contract), HttpStatus.ACCEPTED);
    }

}
