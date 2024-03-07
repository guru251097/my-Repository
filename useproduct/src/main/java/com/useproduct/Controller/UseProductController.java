package com.useproduct.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.useproduct.Entity.Product;
import com.useproduct.Service.UseProductService;

@RestController
@RequestMapping
public class UseProductController {
	@Autowired
	UseProductService useproductservice;

	@GetMapping(value="/getProductWithTax")
	public List<Product> getProductWithTax(){
		return useproductservice.getProductWithTax();
	}

}
