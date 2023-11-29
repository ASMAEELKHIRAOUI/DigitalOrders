package com.example.digitalorders.web.rest;

import com.example.digitalorders.entities.Equipment;
import com.example.digitalorders.service.EquipmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/equipment")
public class EquipmentRest {

    private final EquipmentService equipmentService;

    public EquipmentRest(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @PostMapping
    public ResponseEntity<Equipment> save(@Valid @RequestBody Equipment equipment){
        return new ResponseEntity<>(equipmentService.save(equipment), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> save(@PathVariable Long id,@Valid @RequestBody Equipment equipment){
        return new ResponseEntity<>(equipmentService.update(id, equipment), HttpStatus.ACCEPTED);
    }

}
