package com.example.digitalorders.entities;


import com.example.digitalorders.entities.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Setter
@Getter
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<EquipmentVIN> equipmentVINs;

    private Status status;
}
