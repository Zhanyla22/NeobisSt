package com.example.demo.model;
import com.example.demo.entity.Employee;

import javax.persistence.*;

public class EmployeeModel {
    public EmployeeModel(){
    }

    public Employee(String name,String lastName,String department,int salary, int workExperienceYear){
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.workExperienceYear =workExperienceYear;
    }
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public Integer getSalary(){
        return salary;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public int getWorkExperienceYear(){
        return workExperienceYear;
    }
    public void setWorkExperienceYear(int workExperienceYear){
        this.workExperienceYear= workExperienceYear;
    }
    private String name;
    private String lastName;
    private int salary;
    private int workExperienceYear;
    private String department;

}
