package com.zhanko.learningSpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data //get set

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdersEntity> orders;

    @OneToMany(mappedBy = "customer",
               cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecieptEntity> reciepts;

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "city")
    private String city;



}

