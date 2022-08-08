package com.zhanko.learningSpring.repository;

import com.zhanko.learningSpring.entity.CustomerEntity;
import com.zhanko.learningSpring.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {


}
