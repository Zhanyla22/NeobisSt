package com.example.ShopSpringWeek7.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserModel {
    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
}
