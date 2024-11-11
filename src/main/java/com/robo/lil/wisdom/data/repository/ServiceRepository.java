package com.robo.lil.wisdom.data.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robo.lil.wisdom.data.entity.Service;


public interface ServiceRepository extends JpaRepository<Service, UUID>{
  Optional<Service> findByName(String name);
}
