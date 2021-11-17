package com.example.SpringWeek7.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employee") //имя таблицы-сущность 1z

public class Employee implements Serializable { //сериализация переводит объект в поток байтов, который может быть восстановлен на любой ОС/по сети
    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reciept> reciepts;

    @Id   //primary key
    @Column(name = "id") //обьявляется поле id
    @GeneratedValue(strategy =  GenerationType.AUTO) //id генерирется автоматически начиная с 1
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "lastname",  length = 50)
    private String lastName;

    @Column(name = "department",  length = 50)
    private String department;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "work_experience_year")
    private Integer workExperienceYear;


    public Employee(String name, String lastName, int workExperienceYear, int salary, String department) {
    }
}
