package com.example.ShopSpringWeek7.repository;

import com.example.ShopSpringWeek7.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
