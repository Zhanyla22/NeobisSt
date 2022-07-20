package com.zhanko.learningSpring.contoller;

import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.serviceInterfaceImplement.EmployeeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImplement employeeService;

    @GetMapping("/getEmployee/{empId}")
    public Optional<EmployeeEntity> getEmployeeById(@RequestParam Integer empId){  //написать эксепшн
        return employeeService.getEmployeeById(empId);
    }

    @GetMapping("/allEmployee")
    public List<EmployeeEntity> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/createEmployee")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createNewEmployee(employeeEntity);
    }



    @PutMapping("/updateEmployee/{empId}")
    public ResponseEntity<EmployeeEntity> updateEmployeeById(@PathVariable Integer  empId, EmployeeEntity employeeEntity) throws Exception {
            return employeeService.updateEmployeeById(empId,employeeEntity);

    }



    @DeleteMapping("/deleteEmployee/{empId}")
    public void deleteEmployeeById(@PathVariable Integer  empId){
        employeeService.deleteEmployeeById(empId);
    }


}
