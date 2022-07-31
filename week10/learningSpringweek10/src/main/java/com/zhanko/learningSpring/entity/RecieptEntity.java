package com.zhanko.learningSpring.entity;

import javax.persistence.*;

@Entity
@Table(name = "reciept")
public class RecieptEntity {
    @Id
    @Column(name = "r_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recieptId;

//    @ManyToOne
//    private CustomerEntity customerEntity;
//
//    @ManyToOne EmployeeEntity employeeEntity;
//
//    @ManyToOne
//    private  ProductEntity productEntity;

    @Column(name = "order_date", nullable = false)
    private String ordDate;
}
