package com.example.ecommerce.Inventory_Tracking.repository;

import com.example.ecommerce.Inventory_Tracking.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
