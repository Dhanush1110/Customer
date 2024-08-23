package com.project.lodge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.lodge.entity.Customer;
import com.project.lodge.repository.CustomerRepository;


	@RestController
	public class CustomerController {

	    @Autowired
	    private CustomerRepository customerRepository;

	    @PostMapping("/customers")
	    public Customer createCustomer(@RequestBody Customer customer) {
	        return customerRepository.save(customer);
	    }
	}

