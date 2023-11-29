package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.Demand;
import com.example.digitalorders.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Demand, Long> {

    User getAllById(Long id);

}
