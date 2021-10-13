package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    class EmployeeController {

        private final EmployeeRepository repository;

        EmployeeController(EmployeeRepository repository) {
            this.repository = repository;
        }


        // Aggregate root
        // tag::get-aggregate-root[]
        @GetMapping("/employee")
        List<com.example.demo.controller.EmployeeController> all() {
            return repository.findAll();
        }
        // end::get-aggregate-root[]

        @PostMapping("/employee")
        com.example.demo.controller.EmployeeController newEmployee(@RequestBody com.example.demo.controller.EmployeeController newEmployee) {
            return repository.save(newEmployee);
        }

        // Single item

        @GetMapping("/employee/{id}")
        com.example.demo.controller.EmployeeController one(@PathVariable Long id) {

            return repository.findById(id)
                    .orElseThrow(() -> new EmployeeNotFoundException(id));
        }

        @PutMapping("/employee/{id}")
        com.example.demo.controller.EmployeeController replaceEmployee(@RequestBody com.example.demo.controller.EmployeeController newEmployee, @PathVariable Long id) {

            return repository.findById(id)
                    .map(employee -> {
                        employee.setName(newEmployee.getName());
                        employee.setRole(newEmployee.getRole());
                        return repository.save(employee);
                    })
                    .orElseGet(() -> {
                        newEmployee.setId(id);
                        return repository.save(newEmployee);
                    });
        }

        @DeleteMapping("/employee/{id}")
        void deleteEmployee(@PathVariable Integer id) {
            repository.deleteById(id);
        }
    }
