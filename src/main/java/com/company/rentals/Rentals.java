package com.company.rentals;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "rentals")
public class Rentals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "car_id")
    private int carId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "total_price")
    private double totalPrice;
}
