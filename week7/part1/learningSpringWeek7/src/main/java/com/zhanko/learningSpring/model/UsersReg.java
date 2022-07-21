package com.zhanko.learningSpring.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users_reg")
public class UsersReg {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}
