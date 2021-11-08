package com.example.ShopSpringWeek7.repository;

import com.example.ShopSpringWeek7.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
