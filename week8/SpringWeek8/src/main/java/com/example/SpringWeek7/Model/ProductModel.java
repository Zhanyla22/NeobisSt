package com.example.SpringWeek7.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductModel {
    private String name;
    private String brandName;
    private int cost;
}