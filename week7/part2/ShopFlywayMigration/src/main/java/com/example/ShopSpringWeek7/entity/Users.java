package com.example.ShopSpringWeek7.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}
