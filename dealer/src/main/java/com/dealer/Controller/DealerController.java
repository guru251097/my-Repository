package com.dealer.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealer.CustomException.IdNotFoundException;
import com.dealer.CustomException.NameNotFoundException;
import com.dealer.CustomException.ProductNotFoundException;
import com.dealer.CustomException.RatingCustomException;
import com.dealer.Entity.DealerEntity;
import com.dealer.Service.DealerService;

@RestController
@RequestMapping(value = "/dealerController")
public class DealerController {
	@Autowired
	DealerService dealerservice;

	@PostMapping(value = "/updateUserDetails")
	public String updateUserDetails(@RequestBody DealerEntity d) {
		return dealerservice.updateUserDetails(d);
	}

	@PostMapping(value = "/updateMultipleUser")
	public String updateMultipleUser(@RequestBody List<DealerEntity> d) {
		return dealerservice.updateMultipleUser(d);
	}

	@GetMapping(value = "/findUserById/{id}")
	public Optional<DealerEntity> findUserById(@PathVariable int id) throws IdNotFoundException{
		return dealerservice.findUserById(id);

	}

	@GetMapping(value = "/findAllUser")
	public List<DealerEntity> findAllUser() {
		return dealerservice.findAllUser();

	}

	@GetMapping(value = "/getByProduct/{product}")
	public List<DealerEntity> getByProduct(@PathVariable String product)  throws ProductNotFoundException{
		return dealerservice.getByProduct(product);
	}

	@GetMapping(value = "/getByRating/{rate}")
	public List<DealerEntity> getByRating(@PathVariable float rate) {
		return dealerservice.getByRating(rate);
	}

	@GetMapping(value = "/getNameByFirstLetter/{ch}") // not working
	public List<DealerEntity> getNameByFirstLetter(@PathVariable char ch) {
		return dealerservice.getNameByFirstLetter(ch);
	}

	
	@PostMapping(value = "/saveDealer")//handle exception
	public String saveDealer(@RequestBody DealerEntity d) throws RatingCustomException {
		return dealerservice.saveDealer(d);
	}
	
	@GetMapping(value = "/getByName/{name}")
	public List<DealerEntity> getByName(@PathVariable String name) throws NameNotFoundException{
		return dealerservice.getByName(name);
	}
	

}
