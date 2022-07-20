package com.zhanko.learningSpring.service;

import com.zhanko.learningSpring.entity.CustomerEntity;
import com.zhanko.learningSpring.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInterface {
    List<CustomerEntity> getAllCustomer();

    Optional<CustomerEntity> getCustomerById(Integer cId);

    CustomerEntity createNewCustomer(CustomerEntity customerEntity);

    ResponseEntity<CustomerEntity> updateCustomerById(Integer cId, CustomerEntity customerEntity) throws Exception;

    void deleteCustomerById(Integer cId);
}
