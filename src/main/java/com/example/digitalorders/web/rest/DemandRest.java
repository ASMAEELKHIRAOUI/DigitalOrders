package com.example.digitalorders.web.rest;

import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.service.DemandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demand")
public class DemandRest {

    private final DemandService demandService;

    @PostMapping
    public ResponseEntity<Demand> save(@Valid @RequestBody Demand demand){
        return new ResponseEntity<>(demandService.save(demand), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Demand> save(@PathVariable Long id,@Valid @RequestBody Demand demand){
        return new ResponseEntity<>(demandService.update(id, demand), HttpStatus.ACCEPTED);
    }


}
