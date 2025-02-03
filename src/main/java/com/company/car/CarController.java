package com.company.car;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
//    @Autowired
    private final CarService carService;

    @GetMapping("/get-all")
    public List <Car> getAll() {
        return carService.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public Car getCustomerById(@PathVariable int id) {
        return carService.getById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody Car car) {
        carService.create(car);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id,
                         @RequestBody Car car) {
        return carService.update(id, car);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return carService.delete(id);
    }
}
