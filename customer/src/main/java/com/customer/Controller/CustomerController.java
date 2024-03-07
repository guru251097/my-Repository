package com.customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Entity.Customer;
import com.customer.Service.CustomerService;

@RestController
@RequestMapping(value="/customerController")
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	
	
	@PostMapping(value="/saveCustomerDetails")
	public String saveCustomerDetails(@RequestBody List<Customer> c) {
		return customerservice.saveCustomerDetails(c);
		
	}

}
