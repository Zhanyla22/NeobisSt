package com.example.ShopSpringWeek7.repository;

import com.example.ShopSpringWeek7.entity.Reciept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecieptRepository extends JpaRepository<Reciept,Integer> {
}
