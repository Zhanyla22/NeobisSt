package com.example.SpringWeek7.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    private Client client;

    @ManyToOne
    private  Employee employee;

    @ManyToOne
    private Product product;

    @Column(name = "order_date", nullable = false)
    private String ordDate;
}
