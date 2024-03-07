package com.phone.mobile;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/mobile")
public class MobileController {
	@Autowired
	MobileService mobileservice;
	
	@PostMapping("/saveMobileData")
	public String saveMobileData(@RequestBody Mobile m) {
		return mobileservice.saveMobileData(m);
		
	}
	
	@PostMapping("/saveAllMobileData")
	public String saveAllMobileData(@RequestBody List<Mobile> m) {
		return mobileservice.saveAllMobileData(m);
	}
	
	@GetMapping("/findAllMobileData")
	public List<Mobile> findAllMobileData(){
		return mobileservice.findAllMobileData();
	}
	
	@GetMapping("/findMobileDataById/{a}")
	public Optional<Mobile> findMobileDataById(@PathVariable("a") int a){
		return mobileservice.findMobileDataById(a);
	}
	
	@DeleteMapping("/deleteMobileDataById/{a}")
	public String deleteMobileDataById(@PathVariable("a") int a){
		return mobileservice.deleteMobileDataById(a);
	}
	
	@GetMapping("/getDiscountPrice")
	public List<Integer> getDiscountPrice(){
		return mobileservice.getDiscountPrice();
	}
	
	@GetMapping("/getUniqueBrandName")
	public List<String> getUniqueBrandName(){
		return mobileservice.getUniqueBrandName();
	}
	@GetMapping("/secondHighestPrice")
	public Optional<Mobile> secondHighestPrice() {
		return mobileservice.secondHighestPrice();
	}
	
	@GetMapping("/takeBrandMiddleLetter")
	public List<String> takeBrandMiddleLetter(){
		return mobileservice.takeBrandMiddleLetter();
	}
	@GetMapping(value="/getByPrice/{sal1}/{sal2}")
	public List<Mobile> getByPrice(@PathVariable int sal1,@PathVariable int sal2){
		return mobileservice.getByPrice(sal1,sal2);
	}
	@GetMapping(value="/getNameByStartLetter/{ch}")
	public List<Mobile> getNameByStartLetter(@PathVariable char ch){
		return mobileservice.getNameByStartLetter(ch);
	}
	@GetMapping(value="/getFilterByPrice/{price}/{ram}")
	public List<Mobile> getFilterByPrice(@PathVariable int price,@PathVariable String ram){
		return mobileservice.getFilterByPrice(price,ram);
	}

}