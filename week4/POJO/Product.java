package com.company.week4;

public class Product {
    private int id;
    private String name;
    private String brandName;
    private int cost;

    public Product(){

    }
    public Product( int id,String name,String brandName,int cost){
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.cost =cost;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName(){
        return brandName;
    }

    public void setBrandName(String brandName){
        this.brandName =brandName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
