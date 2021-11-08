package com.example.ShopSpringWeek7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Client")

public class Client {
    @Id
    @Column(name = "client_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clientId;

    @Column(name = "name", nullable = false, length = 50)
    private Integer name;

    @Column(name = "age")
    private Integer age;


    @Column(name = "city")
    private String city;

}
