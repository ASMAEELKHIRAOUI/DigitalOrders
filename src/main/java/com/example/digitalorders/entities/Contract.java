package com.example.digitalorders.entities;


import com.example.digitalorders.entities.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Contract {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Demand demand;

    private Status status;
}
