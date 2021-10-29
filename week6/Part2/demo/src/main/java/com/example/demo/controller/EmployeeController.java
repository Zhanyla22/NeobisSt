package com.example.demo.controller;

import com.example.demo.model.EmployeeModel;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
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

    @GetMapping(value = "/findByIdEmployee")
    public Optional<Employee> getEmployee(@PathVariable("id") Integer id){
        return employeeService.findByIdEmployee(id);

    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.deleteByIdEmployee(id);
        return "deleted...";
    }

    @GetMapping("/addEmployee")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel){
        employeeService.addNewEmployee(employeeModel);
        return employeeModel;
    }

    @GetMapping("/id")
    public String updateEmployee(@PathVariable ("id") Integer id, @RequestBody EmployeeModel employeeModel){
        return employeeService.updateEmployeeById(id, employeeModel);


    }
}