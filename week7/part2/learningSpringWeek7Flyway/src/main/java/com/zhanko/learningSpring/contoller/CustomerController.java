package com.zhanko.learningSpring.contoller;


import com.zhanko.learningSpring.entity.CustomerEntity;
import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.serviceInterfaceImplement.CustomerServiceImplemet;
import com.zhanko.learningSpring.serviceInterfaceImplement.EmployeeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.GroovyWebApplicationContext;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerServiceImplemet customerService;

    @GetMapping("/getCustomer/{cId}")
    public Optional<CustomerEntity> getCustomerById(@RequestParam Integer cId){  //написать эксепшн
        return customerService.getCustomerById(cId);
    }

    @GetMapping("/getAllCustomer")
    public List<CustomerEntity> getAllEmployee(){
        return customerService.getAllCustomer();
    }
    @PostMapping("/createNewCustomer")
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customerEntity ){
        return customerService.createNewCustomer(customerEntity);
    }

    @PutMapping("/updateCustomer/{cid}")
    public ResponseEntity<CustomerEntity> UpdateCustomerById(@PathVariable Integer cId, CustomerEntity customerEntity) throws Exception{
        return customerService.updateCustomerById(cId,customerEntity);
    }

    @DeleteMapping("/deleteCustomer/{cId}")
    public void deleteCustomer(Integer cId){
        customerService.deleteCustomerById(cId);
    }
}
