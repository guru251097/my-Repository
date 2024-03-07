package com.phone.mobile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MobileDao {
	@Autowired
	MobileRepository mobilerepository;
	
	public String saveMobileData(Mobile m) {
		mobilerepository.save(m);
		return "Saved Successfully";
	}
	public String saveAllMobileData(List<Mobile> m) {
		mobilerepository.saveAll(m);
		return "all values saved";
		
	}
	public List<Mobile> findAllMobileData() {
		return mobilerepository.findAll();
	}
	public Optional<Mobile> findMobileDataById(int a) {
		return mobilerepository.findById(a);
	}
	public String deleteMobileDataById(int a) {
		mobilerepository.deleteById(a);
		return "deleted";
	}
	public List<Mobile> getByPrice(int sal1, int sal2) {
		
		return mobilerepository.getByPrice(sal1,sal2);
	}
	
	public List<Mobile> getNameByStartLetter(char ch){
		return mobilerepository.getNameByStartLetter(ch);
	}
	
	public List<Mobile> getFilterByPrice(int price,String ram){
		return mobilerepository.getFilterByPrice(price,ram);
	}
 	
	

}

