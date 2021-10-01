

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String department;
    private int salary;
    private int workExperienceYear;

    public Employee(){

    }
    public Employee(int id,String name,String lastName,String department,int salary,int workExperienceYear){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.workExperienceYear = workExperienceYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getWorkExperienceYear(){
        return workExperienceYear;
    }
    public void setWorkExperienceYear(int workExperienceYear){
        this.workExperienceYear=workExperienceYear;
    }
}
