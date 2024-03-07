package com.bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.Entity.Bank;
import com.bank.Repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankrepository;
	
	public String saveBankDetails(List<Bank> b) {
		bankrepository.saveAll(b);
		return "success";
	}
	
	public String getIfscByBranchName(String name) {
		return bankrepository.getIfscByBranchName(name);
	}

}