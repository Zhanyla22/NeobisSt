package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "employee") //Name of the entity

public class Employee implements Serializable {
    @Id //signifies the primary key
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "last_name", length = 50)
    private String lastName;


    @Column(name = "department", nullable = false)
    private String department;


    @Column(name = "salary", nullable = false)
    // Name of the corresponding database column
    private Integer salary;

    @Column(name = "work_experience_year", length = 10)
    private Integer workExperienceYear;
}

