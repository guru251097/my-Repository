package com.dealer.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealer.Entity.DealerEntity;
import com.dealer.Repository.DealerRepository;

@Repository
public class DealerDao {
	@Autowired
	DealerRepository dealerrepository;

	public String updateUserDetails(DealerEntity d) {
		dealerrepository.save(d);
		return "successfully saved";
	}

	public String updateMultipleUser(List<DealerEntity> d) {
		dealerrepository.saveAll(d);
		return "All User Added";
	}

	public Optional<DealerEntity> findUserById(int id) {
		return dealerrepository.findById(id);
	}

	public List<DealerEntity> findAllUser() {

		return dealerrepository.findAll();
	}

	public List<DealerEntity> getByProduct(String product) {

		return dealerrepository.getByProduct(product);
	}

	public List<DealerEntity> getByRating(float rate) {
		return dealerrepository.getByRating(rate);
	}

	public List<DealerEntity> getNameByFirstLetter(char ch) {// not working

		return dealerrepository.getNameByFirstLetter(ch);
	}

	

	public String saveDealer(DealerEntity d) {
		dealerrepository.save(d);
		return "success";
	}

	public List<DealerEntity> getByName(String name) {
		
		return dealerrepository.getByName(name);
	}

}