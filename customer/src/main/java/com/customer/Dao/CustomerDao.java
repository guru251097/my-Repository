package com.customer.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.Entity.Customer;
import com.customer.Repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository customerrepository;

	public String saveCustomerDetails(Customer x) {
		
	customerrepository.save(x);
	return "successs";
	}

}
