package com.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Dao.BankDao;
import com.bank.Entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bankdao;
	
	public String saveBankDetails(List<Bank> b) {
		return bankdao.saveBankDetails(b);
		
	}
	
	public String getIfscByBranchName(String name) {
		return bankdao.getIfscByBranchName(name);
	}
	

}
