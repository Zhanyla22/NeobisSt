package com.example.ShopSpringWeek7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "reciept")

public class Reciept {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recieptId;

    @ManyToOne
    private Client client_id;

    @ManyToOne
    private  Employee emp_id;

    @ManyToOne
    private Product prod_id;

    @Column(name = "order_date", nullable = false)
    private String ordDate;
}
