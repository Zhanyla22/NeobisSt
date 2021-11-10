package com.example.SpringWeek7.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product")

public class Product {
    @OneToMany(mappedBy = "product",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordering> orders;

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reciept> reciepts;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name="brand_name")
    private String brandName;

    @Column(name="cost")
    private Integer cost;


    public Product( String name, String brandName, int cost) {
    }
}
