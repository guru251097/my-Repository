package com.useproduct.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.useproduct.Entity.Product;

@Service
public class UseProductService {
	@Autowired
	RestTemplate resttemplate;
	
	public List<Product> getProductWithTax(){
		String url1="http://localhost:8082/productController/getAllProductData";
		String url2="http://localhist:8080/gstController/getTaxByHsn/";
		ResponseEntity<List<Product>> response1=resttemplate.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<Product>>(){});
		List<Product> prods = response1.getBody();
		for(Product x:prods) {
			int hsn=x.getHsn();
			ResponseEntity<Integer> response2 = resttemplate.exchange(url2+hsn, HttpMethod.GET,null,Integer.class);
			int tax = response2.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*tax)/100);
			
		}
		return prods;
		
	}
	
	
	

}
