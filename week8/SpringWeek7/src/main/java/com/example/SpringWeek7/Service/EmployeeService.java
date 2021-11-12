package com.example.SpringWeek7.Service;


import com.example.SpringWeek7.Entity.Employee;
import com.example.SpringWeek7.Model.EmployeeModel;
import com.example.SpringWeek7.Repository.EmployeeRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Service

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> findByIdEmployee(Integer id) throws Exception{
        return Optional.ofNullable(employeeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("There is no such an Employee with this id :", id))));

    }

    public  Employee addNewEmployee(EmployeeModel employeeModel){
        Employee employee = new Employee(employeeModel.getName(),employeeModel.getLastName(),employeeModel.getWorkExperienceYear(),employeeModel.getSalary(),employeeModel.getDepartment());
        return employeeRepository.save(employee);
    }
    public  String updateEmployeeById(Integer id, EmployeeModel employeeModel) throws Exception{
        Optional<Employee> employee = employeeRepository.findById(id);
        employee.get().setDepartment(employeeModel.getDepartment());
        employee.get().setName(employeeModel.getName());
        employee.get().setLastName(employeeModel.getLastName());
        employee.get().setSalary(employeeModel.getSalary());
        employee.get().setWorkExperienceYear(employeeModel.getWorkExperienceYear());
        return "updated sucessfuly";
    }

}
