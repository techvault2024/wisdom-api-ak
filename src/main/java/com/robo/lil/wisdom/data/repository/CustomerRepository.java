package com.robo.lil.wisdom.data.repository;

import java.util.UUID;
import com.robo.lil.wisdom.data.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer, UUID>{
  Optional<Customer> findByEmail(String email);
}
