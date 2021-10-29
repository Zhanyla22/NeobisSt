package com.example.ShopSpringWeek7.service;


import com.example.ShopSpringWeek7.model.EmployeeModel;
import com.example.ShopSpringWeek7.entity.Employee;
import com.example.ShopSpringWeek7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmployeeService {
    @Autowired

    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> findByIdEmployee(Integer id){
        return employeeRepository.findById(id);
    }
    public void deleteByIdEmployee(Integer id){
        employeeRepository.deleteById(id);
    }
    public  Employee addNewEmployee(EmployeeModel employeeModel){
        Employee employee = new Employee(1,employeeModel.getName(),employeeModel.getLastName(), employeeModel.getDepartment(), employeeModel.getWorkExperienceYear(), employeeModel.getSalary());
        return employeeRepository.save(employee);
    }
    public  String updateEmployeeById(Integer id, EmployeeModel employeeModel){
        Optional<Employee> employee = employeeRepository.findById(id);
        employee.get().setDepartment(employeeModel.getDepartment());
        employee.get().setName(employeeModel.getName());
        employee.get().setLastName(employeeModel.getLastName());
        employee.get().setSalary(employeeModel.getSalary());
        employee.get().setWorkExperienceYear(employeeModel.getWorkExperienceYear());
        return "updated...";
    }

}
