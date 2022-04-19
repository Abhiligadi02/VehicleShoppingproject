package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

 

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired 
	private CustomerRepository customerRepository;
	
	// Create API
	
	@GetMapping("/customers")
	public List<Customer>  getAllEmployees() {
		return customerRepository.findAll();
	}
	
	//Create employee Rest API 
	
	@PostMapping("/customers")
	public Customer createEmployee(@RequestBody Customer employee)
	{
		return customerRepository.save(employee);
	}

}
