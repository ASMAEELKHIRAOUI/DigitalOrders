package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}
