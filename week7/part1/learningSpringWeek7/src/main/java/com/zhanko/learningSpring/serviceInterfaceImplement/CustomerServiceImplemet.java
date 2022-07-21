package com.zhanko.learningSpring.serviceInterfaceImplement;

import com.zhanko.learningSpring.entity.CustomerEntity;
import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.repository.CustomerRepository;
import com.zhanko.learningSpring.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplemet implements CustomerServiceInterface {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImplemet(CustomerRepository customerRepository){
        this.customerRepository= customerRepository;
    }

    @Override
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<CustomerEntity> getCustomerById(Integer cId) {
        return customerRepository.findById(cId);
    }

    @Override
    public CustomerEntity createNewCustomer(CustomerEntity customerEntity) {
        return  customerRepository.save(customerEntity);
    }

    @Override
    public ResponseEntity<CustomerEntity> updateCustomerById(Integer cId, CustomerEntity customerEntity) throws Exception {
        try {
            CustomerEntity customerFromDB = customerRepository.findById(cId).get();
            System.out.println(customerFromDB.toString());
            customerFromDB.setCId(customerEntity.getCId());
            customerFromDB.setName(customerEntity.getName());
            customerFromDB.setLastName(customerEntity.getLastName());
            customerFromDB.setAge(customerEntity.getAge());
            customerFromDB.setCity(customerEntity.getCity());
            return new ResponseEntity<CustomerEntity>(customerRepository.save(customerFromDB), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<CustomerEntity>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteCustomerById(Integer cId) {
        customerRepository.deleteById(cId);

    }
}
