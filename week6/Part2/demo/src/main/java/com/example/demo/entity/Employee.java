package com.example.demo.entity;
import javax.persistence.*;
import java.io.Serializable;

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
    public Employee(){

    }
    public Employee(Integer empId,String name,String lastName,String department,int salary, int workExperienceYear){
        this.empId =empId;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.workExperienceYear =workExperienceYear;
    }
    public Integer getempId(){
        return empId;
    }
    public void setEmpId(Integer empId){
        this.empId = empId;
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
}


