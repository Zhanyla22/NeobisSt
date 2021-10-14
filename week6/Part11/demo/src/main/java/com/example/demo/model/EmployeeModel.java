package com.example.demo.model;
import com.example.demo.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeModel {
    private String name;
    private String lastName;
    private int salary;
    private int workExperienceYear;
    private String department;

}
