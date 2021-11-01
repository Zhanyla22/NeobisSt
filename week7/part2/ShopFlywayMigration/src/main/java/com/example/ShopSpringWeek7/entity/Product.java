package com.example.ShopSpringWeek7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = " product")

public class Product {
    @Id
    @Column(name = "prod_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "name")
    private String name;

    @Column(name="brand_name")
    private String brandName;

    @Column(name="cost")
    private Integer cost;
}
