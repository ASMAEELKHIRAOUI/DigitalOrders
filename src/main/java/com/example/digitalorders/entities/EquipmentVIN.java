package com.example.digitalorders.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EquipmentVIN {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin;

    @ManyToMany(mappedBy = "equipmentVINs")
    private Set<Demand> demands;
}
