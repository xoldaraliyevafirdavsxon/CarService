package com.company.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/get-all")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody Customer customer) {
        customerService.create(customer);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id,
                               @RequestBody Customer customer) {
        return customerService.update(id, customer);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return customerService.delete(id);
    }


}
