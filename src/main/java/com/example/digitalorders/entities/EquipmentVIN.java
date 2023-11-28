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

    @ManyToMany
    @JoinTable(
            name = "demand_equipmentvins",
            joinColumns = @JoinColumn(name = "Equipmentvin_id"),
            inverseJoinColumns = @JoinColumn(name = "demand_id")
    )
    private Set<Demand> demands;
}
