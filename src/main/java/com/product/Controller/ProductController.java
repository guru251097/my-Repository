package com.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.Entity.Product;
import com.product.Service.ProductService;

@RestController
@RequestMapping(value = "/productController")
public class ProductController {

	@Autowired
	ProductService productservice;

	@PostMapping(value = "/saveProductData")
	public String saveProductData(@RequestBody List<Product> p) {
		return productservice.saveProductData(p);
	}
	
	@GetMapping(value="getAllProductData")
	public List<Product> getAllProductData(){
		return productservice.getAllProductData();
	}

}
