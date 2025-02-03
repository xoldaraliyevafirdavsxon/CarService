package com.company.rentals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rentals, Integer> {
    Rentals getAllById();
    List<Rentals> getAllByStartDate();
    List<Rentals> getAllByEndDate();
    List<Rentals> getAllByTotalPrice();
    boolean existsAllById(Integer id);
}
