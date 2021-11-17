package com.example.SpringWeek7.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor //const defaut
@AllArgsConstructor
@Data //get set
@Entity
@Table(name = "client")

public class Client {
    @OneToMany(mappedBy = "client",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordering> orders;

    @OneToMany(mappedBy = "client",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reciept> reciepts;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "age")
    private Integer age;


    @Column(name = "city")
    private String city;



}
