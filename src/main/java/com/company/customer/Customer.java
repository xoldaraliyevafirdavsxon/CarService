package com.company.customer;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;
}
