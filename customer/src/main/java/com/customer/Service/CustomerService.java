package com.customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.Dao.CustomerDao;
import com.customer.Entity.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerDao customerdao;
	
	@Autowired
	RestTemplate resttemplate;
	
	
	public String saveCustomerDetails(List<Customer> s) {
		for(Customer x:s) {
			String inputBranch=x.getBranch();
			String url="http://localhost:8080/bankController/getIfscByBranchName/";
			ResponseEntity<String> response=resttemplate.exchange(url+inputBranch,HttpMethod.GET,null,String.class);
			String ifsc=response.getBody();
				x.setIfscCode(ifsc);
				customerdao.saveCustomerDetails(x);
		}
		return "success"; 
		 
	}
	
	

}
