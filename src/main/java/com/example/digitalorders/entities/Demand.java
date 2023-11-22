package com.example.digitalorders.entities;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Demand {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startingDate;

    private LocalDateTime endingDate;

    @ManyToOne
    private User user;

    private Float total;

    private String address;

    @OneToOne
    private Contract contract;
}
