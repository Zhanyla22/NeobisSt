package com.example.SpringWeek7.Controller;

import com.example.SpringWeek7.Entity.Employee;
import com.example.SpringWeek7.Model.EmployeeModel;
import com.example.SpringWeek7.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/All-Info-Employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Integer id) throws Exception {
        return employeeService.findByIdEmployee(id);

    }

    @PostMapping("/add-Employee")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel){
        employeeService.addNewEmployee(employeeModel);
        return employeeModel;
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable ("id") Integer id, @RequestBody EmployeeModel employeeModel) throws Exception{
        return employeeService.updateEmployeeById(id, employeeModel);


    }
}