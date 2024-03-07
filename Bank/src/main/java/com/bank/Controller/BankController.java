package com.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Entity.Bank;
import com.bank.Service.BankService;

@RestController
@RequestMapping(value="/bankController")
public class BankController {
	
	@Autowired
	BankService bankservice;
	
	
	@PostMapping(value="saveBankDetails")
	public String saveBankDetails(@RequestBody List<Bank> b) {
		return bankservice.saveBankDetails(b);
	}
	
	@GetMapping(value="getIfscByBranchName/{name}")
	public String getIfscByBranchName(@PathVariable String name) {
		return bankservice.getIfscByBranchName(name);
	}
	 

}
