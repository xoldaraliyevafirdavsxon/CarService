package com.company.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car create(Car car){
        if (carRepository.existsAllById(car.getId())){
            throw new RuntimeException("Car already exists");
        } else {
            return carRepository.save(car);
        }
    }

    public Car getById(int id){
        return carRepository.getAllById();
    }

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public String update(int id, Car car){
        Car car1 = getById(id);
        if (car1.getId() == id){
            carRepository.save(car);
            return "Car updated";
        }else {
            return "Car not found";
        }
    }

    public String delete(int id){
        carRepository.deleteById(id);
        return "Car deleted";
    }





}
