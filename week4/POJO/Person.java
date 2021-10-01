package com.company.week4;

public class Person {
    private int id;
    private int age;
    private String name;
    private String city;

    public Person(){

    }
    public Person(int id,int age,String name,String city){
        this.id = id;
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
}
