package com.product.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.Entity.Product;
import com.product.Repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productrepository;
	
	
	public String saveProductData(List<Product> p) {
		productrepository.saveAll(p);
		return "succcess";
		
	}
	
	public List<Product> getAllProductData(){
		return productrepository.findAll();
	}
	

}
