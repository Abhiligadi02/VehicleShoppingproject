package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
 
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return service.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/CustomerById/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }

    @GetMapping("/customer/{name}")
    public Customer findCustomerByName(@PathVariable String fullName) {
        return service.getCustomerByName(fullName);
    }

    @PutMapping("/updates")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/deletes/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return service.deleteCustomer(id);
    }
}
