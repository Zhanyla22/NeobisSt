package com.example.ShopSpringWeek7.repository;

import com.example.ShopSpringWeek7.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
