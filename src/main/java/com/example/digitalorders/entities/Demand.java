package com.example.digitalorders.entities;


import com.example.digitalorders.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToMany(mappedBy ="demands")
    private Set<EquipmentVIN> equipmentVINs;

    private Status status;
}
