package com.bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {
	
	@Query(value="select ifsc_code from bank where branch=? limit 1",nativeQuery=true)
	public String getIfscByBranchName(String name);

}
