package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="employee") //имя таблицы-сущность 1й

public class Employee implements Serializable {
    @Id   //primary key
    @Column(name = "emp_id",nullable = false)
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer empId;

    @Column(name = "name", nullable = false,length = 50)
    private String name;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "department", nullable = false, length = 50)
    private String department;

    @Column(name = "salary", nullable = false)
    private Integer salary;

    @Column(name = "work_experience_year",nullable = false)
    private Integer workExperienceYear;
}

