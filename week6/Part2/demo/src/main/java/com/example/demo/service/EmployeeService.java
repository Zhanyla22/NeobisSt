package com.example.demo.service;
import com.example.demo.entity.Employee;
import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private com.example.demo.repository.EmployeeRepository EmployeeRepository;

    public List<Employee> getAllEmployee() {
        return EmployeeRepository.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return EmployeeRepository.findById(id);
    }

    public void deleteById(Integer id) {
        EmployeeRepository.deleteById(id);
    }

    public Employee createProduct(EmployeeModel model) {
        Employee employee = new Employee(1, model.getName(), model.getSalary());

        return EmployeeRepository.save(Employee);
    }

    public Employee updateEmployeeById(Integer id, EmployeeModel model) throws Exception {
        return EmployeeRepository.findById(id)
                .map(updateProduct -> {
                    updateEmployee.setName(model.getName());
                    updateEmployee.setSalary(model.getSalary());
                    return EmployeeRepository.save(updateEmployee());
                }).orElseThrow(Exception::new);
    }
}
