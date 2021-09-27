package com.company.week4;

public class Employee {
    int id;
    String Name;
    String LastName;
    String Department;
    int Salary;
    int WorkExperienceYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public String getDepartment(){
        return Department;
    }
    public void setDepartment(String Department){
        this.Department=Department;
    }
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int Salary){
        this.Salary=Salary;
    }
    public int getWorkExperienceYear(){
        return WorkExperienceYear;
    }
    public void setWorkExperienceYear(int workExperienceYear){
        this.WorkExperienceYear=WorkExperienceYear;
    }
}
