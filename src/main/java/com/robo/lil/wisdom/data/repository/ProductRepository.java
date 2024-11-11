package com.robo.lil.wisdom.data.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robo.lil.wisdom.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, UUID>{
  Optional<Product> findByName(String name);
}
