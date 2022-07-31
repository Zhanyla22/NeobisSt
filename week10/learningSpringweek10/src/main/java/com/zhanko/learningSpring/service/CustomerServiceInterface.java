package com.zhanko.learningSpring.service;

import com.zhanko.learningSpring.entity.CustomerEntity;
import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.model.CustomerModel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInterface {
    List<CustomerEntity> getAllCustomer();

    ResponseEntity<CustomerModel> getCustomerById(Integer cId) throws Exception;

    ResponseEntity<CustomerModel> createNewCustomer(CustomerModel customerModel) throws Exception;

    ResponseEntity<CustomerModel> updateCustomerById(Integer cId, CustomerModel customerModel) throws Exception;

    void deleteCustomerById(Integer cId);
}
