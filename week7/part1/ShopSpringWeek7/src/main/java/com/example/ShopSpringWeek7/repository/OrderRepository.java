package com.example.ShopSpringWeek7.repository;

import com.example.ShopSpringWeek7.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
