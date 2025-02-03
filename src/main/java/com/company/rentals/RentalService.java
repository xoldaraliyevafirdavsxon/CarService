package com.company.rentals;

import com.company.rentals.Rentals;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalService {

    private final RentalRepository rentalRepository;

//    public RentalService(RentalRepository rentalRepository) {
//        this.rentalRepository = rentalRepository;
//    }

    public Rentals create(Rentals rentals){
        if (rentalRepository.existsAllById(rentals.getId())){
            throw new RuntimeException("Rentals already exists");
        } else {
            return rentalRepository.save(rentals);
        }
    }

    public Rentals getById(int id){
        return rentalRepository.getAllById();
    }

    public String update(int id, Rentals car){
        Rentals car1 = getById(id);
        if (car1.getId() == id){
            rentalRepository.save(car);
            return "Rentals updated";
        }else {
            return "Rentals not found";
        }
    }

    public List<Rentals> getAll(){
        return rentalRepository.findAll();
    }

    public String delete(int id){
        rentalRepository.deleteById(id);
        return "Rentals deleted";
    }
}
