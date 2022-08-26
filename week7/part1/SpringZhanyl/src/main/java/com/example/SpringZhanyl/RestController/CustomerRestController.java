package com.example.SpringZhanyl.RestController;

import com.example.SpringZhanyl.Entity.CustomerEntity;
import com.example.SpringZhanyl.Model.CustomerModel;
import com.example.SpringZhanyl.ServiceImplement.CustomerServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    CustomerServiceImplement customerServiceImplement;

    @GetMapping("/getCustomer/{cId}")
    public ResponseEntity<CustomerModel> getCustomerById(@PathVariable Integer cId)throws Exception{
        return customerServiceImplement.getCustomerById(cId);
    }

    @GetMapping("/getAllCustomer")
    public List<CustomerEntity> getAllEmployee(){
        return customerServiceImplement.getAllCustomer();
    }

    @PostMapping("/createNewCustomer")
    public ResponseEntity<CustomerModel> createCustomer(@RequestBody CustomerModel customerModel ) throws Exception{
        return customerServiceImplement.createNewCustomer(customerModel);
    }

    @PutMapping("/updateCustomer/{cid}")
    public ResponseEntity<CustomerModel> updateCustomerById(@RequestBody Integer cId, CustomerModel customerModel) throws Exception{
        return customerServiceImplement.updateCustomerById(cId,customerModel);
    }

    @DeleteMapping("/deleteCustomer/{cId}")
    public void deleteCustomer(Integer cId){
        customerServiceImplement.deleteCustomerById(cId);
    }



}
