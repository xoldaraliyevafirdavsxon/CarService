package com.company.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    Car getAllById();
    List<Car> getAllByBrand();
    List<Car> getAllByDailyPrice();
    List<Car> getAllByYear();
    boolean existsAllById(Integer id);
}
