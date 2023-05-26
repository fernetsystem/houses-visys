package com.visys.houses.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "address", length = 500)
    private String address;

    @Column(name = "pictureMain", length = 1200)
    private String pictureMain;

    @Column(name = "price")
    private Double price;



}
