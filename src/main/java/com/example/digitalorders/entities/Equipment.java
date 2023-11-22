package com.example.digitalorders.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Equipment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer quantity;

    private Float pricePerDay;

    @ManyToOne
    private Manufacturer manufacturer;

    @ManyToOne
    private Category category;
}
