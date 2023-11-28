package com.example.digitalorders.controllers;

import com.example.digitalorders.service.EquipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/equipments")
public class EquipmentController {
    private EquipmentService equipmentService;
    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }
    @PostMapping
    public ResponseEntity createEquipment(@Valid @RequestBody EquipmentRequestVM equipmentRequestVM){
        Equipment equipment = equipmentService.createEquipment(equipmentRequestVM.toEquipment());
        return ResponseMessage.created(EquipmentResponseVM.fromEquipment(equipment),
                "Equipment created successfully");
    }
    @GetMapping("/{id}")
    public ResponseEntity getEquipmentById(@PathVariable Long id){
        Equipment equipment = equipmentService.getEquipmentById(id);
        return ResponseMessage.ok(EquipmentResponseVM.fromEquipment(equipment),
                "Equipment retrieved successfully");
    }
    @GetMapping
    public ResponseEntity getAllEquipment() {
        List<Equipment> equipments = equipmentService.getAllEquipment();
        if ( equipments == null ){
            return ResponseMessage.notFound("No equipments found");
        }
        return ResponseMessage.ok(equipments.stream().map(EquipmentResponseVM::fromEquipment).toList(),
                "Equipment retrieved successfully");
    }
    @PutMapping("/{id}")
    public ResponseEntity updateEquipment(@PathVariable Long id,@Valid @RequestBody EquipmentRequestVM equipmentRequestVM){
        Equipment equipment = equipmentService.updateEquipment(id,equipmentRequestVM.toEquipment());
        return ResponseMessage.ok(EquipmentResponseVM.fromEquipment(equipment),
                "Equipment updated successfully");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteEquipment(@PathVariable Long id){
        equipmentService.deleteEquipment(id);
        return ResponseMessage.ok(null,
                "Equipment deleted successfully");
    }
    @GetMapping("/model/{name}")
    public ResponseEntity getAllEquipmentByModel(@PathVariable String name){
        List<Equipment> equipments = equipmentService.getAllEquipmentByModel(name);
        if ( equipments == null ){
            return ResponseMessage.notFound("No equipments found");
        }
        return ResponseMessage.ok(equipments.stream().map(EquipmentResponseVM::fromEquipment).toList(),
                "Equipment retrieved successfully");
    }
    @GetMapping("/serial/{serialNumber}")
    public ResponseEntity getEquipmentBySerialNumber(@PathVariable String serialNumber){
        Equipment equipment = equipmentService.getEquipmentBySerialNumber(serialNumber);
        if ( equipment == null ){
            return ResponseMessage.notFound("No equipment found");
        }
        return ResponseMessage.ok(EquipmentResponseVM.fromEquipment(equipment),
                "Equipment retrieved successfully");
    }
}
