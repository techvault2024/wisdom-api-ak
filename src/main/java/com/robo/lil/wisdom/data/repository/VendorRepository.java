package com.robo.lil.wisdom.data.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robo.lil.wisdom.data.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, UUID>{
  Optional<Vendor> findByEmail(String email);
}
