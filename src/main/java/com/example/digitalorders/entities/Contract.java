package com.example.digitalorders.entities;


import com.example.digitalorders.entities.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Contract {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Demand demand;

    private Status status;
}
