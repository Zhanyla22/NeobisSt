package com.zhanko.learningSpring.repository;

import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
