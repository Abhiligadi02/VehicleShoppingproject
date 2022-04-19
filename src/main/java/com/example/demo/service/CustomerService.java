package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> products) {
        return repository.saveAll(products);
    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Customer getCustomerByName(String fullName) {
        return repository. findByFullName(fullName);
    }

    public String deleteCustomer(int id) {
        repository.deleteById(id);
        return "customer removed !! " + id;
    }

    public Customer updateCustomer(Customer customer) {
    	Customer existingcustomer = repository.findByEmailId(customer.getEmailId());
        existingcustomer.setPassword(customer.getPassword());
//    public Customer updateCustomer(Customer customer) {
//    	Customer existingcustomer = repository.findById(customer.getId()).orElse(null);
//        existingcustomer.setFullName(customer.getFullName());
//        existingcustomer.setEmailId(customer.getEmailId());
//        existingcustomer.setPassword(customer.getPassword());
//        existingcustomer.setPhoneNumber(customer.getPhoneNumber());
//        existingcustomer.setAddress(customer.getAddress());


        
        
        return repository.save(existingcustomer);
    }


}