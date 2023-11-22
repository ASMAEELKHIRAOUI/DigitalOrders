package com.example.digitalorders.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class EquipmentVIN {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin;
}
