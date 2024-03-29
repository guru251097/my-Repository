package com.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Dao.ProductDao;
import com.product.Entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productdao;
	
	
	public String saveProductData(List<Product> p) {
		return productdao.saveProductData(p);
	}
	
	
	public List<Product> getAllProductData(){
		return productdao.getAllProductData();
	}

}
