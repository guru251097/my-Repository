package com.dealer.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.CustomException.IdNotFoundException;
import com.dealer.CustomException.NameNotFoundException;
import com.dealer.CustomException.ProductNotFoundException;
import com.dealer.CustomException.RatingCustomException;
import com.dealer.Dao.DealerDao;
import com.dealer.Entity.DealerEntity;

@Service
public class DealerService {
	@Autowired
	DealerDao dealerdao;

	public String updateUserDetails(DealerEntity d) {
		return dealerdao.updateUserDetails(d);
	}

	public String updateMultipleUser(List<DealerEntity> d) {
		return dealerdao.updateMultipleUser(d);

	}

	public Optional<DealerEntity> findUserById(int id)  throws IdNotFoundException{
		if(dealerdao.findUserById(id).isEmpty()) {
			throw new IdNotFoundException("entered id is not found");
		}else {
			return dealerdao.findUserById(id);
		}
		
	}

	public List<DealerEntity> findAllUser() {

		return dealerdao.findAllUser();
	}

	public List<DealerEntity> getByProduct(String product) throws ProductNotFoundException{
		if(dealerdao.getByProduct(product).isEmpty()) {
			throw new ProductNotFoundException("product not found");
		}
		else {
			return dealerdao.getByProduct(product);
		}
		
	}

	public List<DealerEntity> getByRating(float rate) {
		return dealerdao.getByRating(rate);
	}

	public List<DealerEntity> getNameByFirstLetter(char ch) {// not working

		return dealerdao.getNameByFirstLetter(ch);
	}

	

	public String saveDealer(DealerEntity d) throws RatingCustomException {
		try {
			if (d.getRating() >= 1 && d.getRating() <= 5) {
				return dealerdao.saveDealer(d);
			} else {
				throw new RatingCustomException("please give rating between 1 to 5");
			}
		} catch (Exception e) {
			return "please give rating between 1 to 5 in catch stmt";

		}
	}

	public List<DealerEntity> getByName(String name) throws NameNotFoundException {
		if(dealerdao.getByName(name).isEmpty()) {
			throw new NameNotFoundException("Entered name not in the db");
		}else {
			return dealerdao.getByName(name);
			
		}
		
		
	}

}