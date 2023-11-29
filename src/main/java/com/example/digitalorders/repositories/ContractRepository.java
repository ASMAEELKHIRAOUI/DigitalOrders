package com.example.digitalorders.repositories;

import com.example.digitalorders.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
