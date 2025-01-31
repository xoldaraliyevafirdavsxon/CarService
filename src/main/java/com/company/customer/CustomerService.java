package com.company.customer;

import com.company.car.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer create(Customer customer){
        if (customerRepository.existsAllById(customer.getId())){
            throw new RuntimeException("Customer already exists");
        } else {
            return customerRepository.save(customer);
        }
    }

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Customer getById(int id){
        return customerRepository.getById();
    }

    public String update(int id, Customer customer){
        Customer customer1 = getById(id);
        if (customer1.getId() == id){
            customerRepository.save(customer);
            return "Customer updated";
        }else {
            return "Customer not found";
        }
    }

    public String delete(int id){
        customerRepository.deleteById(id);
        return "Customer deleted";
    }
}
