package com.company.car;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "daily_price")
    private double dailyPrice;
}
