package com.example.ShopSpringWeek7.controller;

import com.example.ShopSpringWeek7.model.EmployeeModel;
import com.example.ShopSpringWeek7.entity.Employee;
import com.example.ShopSpringWeek7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
 class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/AllInfoEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") Integer id){
        return employeeService.findByIdEmployee(id);

    }


    @PostMapping("/addEmployee")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel){
        employeeService.addNewEmployee(employeeModel);
        return employeeModel;
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable ("id") Integer id, @RequestBody EmployeeModel employeeModel){
        return employeeService.updateEmployeeById(id, employeeModel);


    }
}
