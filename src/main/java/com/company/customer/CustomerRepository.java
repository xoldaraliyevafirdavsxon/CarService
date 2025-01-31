package com.company.customer;

import com.company.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer getById();
    List<Customer> getAllByName();
    Customer getAllByPhone();
    boolean existsAllById(Integer id);
}
