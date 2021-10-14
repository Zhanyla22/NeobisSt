package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;
import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/employee")
    class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value ="/allEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping(value ="/getEmployee")
    public Optional<Employee> getEmployee(@PathVariable("id") Integer id){
        return employeeService.findId(id);
    }
    @GetMapping("/addEmployee")
    public EmployeeModel createEmployee(@RequestBody EmployeeModel model){
        employeeService.addEmployee(model);
        return model;
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.deleteById(id);
        return "deleted";
    }
    @GetMapping("/{id}")
    public String updateEmployee(@PathVariable ("id") Integer id, @RequestBody EmployeeModel model) {
        return employeeService.updateEmployeeById(id,model);
    }



    }
