package com.company.week4;

public class MainClass {
    public static void main(String[] args) {
        Person object=new Person();
        object.setId(89823);
        object.setAge(18);
        object.setName("Zhanylai");
        object.setCity("Bishkek");

        Employee emp=new Employee();
        emp.setId(1);
        emp.setLastName("Gulmira");
        emp.setLastName("Myratova");
        emp.setDepartment("Продавец");
        emp.setSalary(20000);
        emp.setWorkExperienceYear(6);

        Product product=new Product();
        product.setId(1);
        product.setName("Cola");
        product.setCost(50);

        System.out.println("id напитка: "+ product.getId());
        System.out.println("Наимование: "+ product.getName());
        System.out.println("цЕНА: " + product.getCost());

        System.out.println("Id продавца: " +emp.getId());
        System.out.println("ФИО продавца "+ emp.getLastName());
        System.out.println("Опыт работы: "+ emp.getWorkExperienceYear());
        System.out.println("Id покупателя: "+ object.getId());
        System.out.println("Возраст: "+object.getAge());
        System.out.println("Имя покупателя: "+ object.getName());
        System.out.println("Город: "+ object.getCity());
    }
}
