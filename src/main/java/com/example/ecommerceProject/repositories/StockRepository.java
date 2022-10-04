package com.example.ecommerceProject.repositories;

import com.example.ecommerceProject.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository <Stock, Long> {
}
