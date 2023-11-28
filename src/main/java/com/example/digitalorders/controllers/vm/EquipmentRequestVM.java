package com.example.digitalorders.controllers.vm;

import com.example.digitalorders.entities.Equipment;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record EquipmentRequestVM(
    @NotNull(message = "price must not be null")
    Float pricePerDay,
    @NotBlank(message = "name cannot be null")
    String name,
    @NotBlank(message = "model Name cannot be null")
    String modelName,
    @NotBlank(message = "family name cannot be null")
    String familyName,
    @NotBlank(message = "serial number cannot be null")
    String serialNumber,
    @NotBlank(message = "vehicle condition cannot be null")
    String condition,
    String color,
    String fuel,
    @NotBlank(message = "description cannot be null")
    String description
) {
        public Equipment toEquipment(){
            return new Equipment().builder()
                    .pricePerDay(pricePerDay)
                    .name(name)
                    .serialNumber(serialNumber)
                    .description(description)
                    .vehicleCondition(EquipmentCondition.valueOf(condition))
                    .color(color)
                    .fuel(EquipmentFuel.valueOf(fuel))
                    .model(Model.builder()
                            .name(modelName)
                            .family(Family.builder()
                                    .name(familyName)
                                    .build())
                            .build())
                    .build();
        }
}
