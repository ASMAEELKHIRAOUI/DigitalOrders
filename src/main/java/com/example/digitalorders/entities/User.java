package com.example.digitalorders.entities;


import com.example.digitalorders.entities.enums.Role;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private Long id;

    private String email;

    private String username;

    private String password;

    private Role role;
}
