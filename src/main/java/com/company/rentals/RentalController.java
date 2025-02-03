package com.company.rentals;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rentals")
public class RentalController {
//    @Autowired
    private final RentalService rentalService;

    @GetMapping("/get-all")
    public List<Rentals> getAllCustomers() {
        return rentalService.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public Rentals getCustomerById(@PathVariable int id) {
        return rentalService.getById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody Rentals customer) {
        rentalService.create(customer);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id,
                         @RequestBody Rentals customer) {
        return rentalService.update(id, customer);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return rentalService.delete(id);
    }
}
