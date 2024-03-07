package com.restTemplate.controller;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/RestTemplateSample")
public class RestTemplateSample {
	
	RestTemplate rest=new RestTemplate();//object creation,for RestTemplate object creation is not automatic by @componentscan so we use new keyword
	
	@GetMapping(value="/getNameBySampleProject")
	public String getNameBySampleProject() {
		String url="http://localhost:8080/sampleProjectController/getName";
		ResponseEntity<String> response=rest.exchange(url,HttpMethod.GET,null,String.class);//(thirdpartyapi url,HttpMethod of url,header,reference class)
		String value=response.getBody();//change ResponseEntity to String
		return value;
		
	}
	
	@GetMapping(value="/getNumberViaSampleProject/{a}/{b}")
	public int getNumberViaSampleProject(@PathVariable int a,@PathVariable int b) {
		String url1="http://localhost:8080/sampleProjectController/addTwoNumber/"+a+"/"+b;
		ResponseEntity<Integer> response=rest.exchange(url1,HttpMethod.GET,null,Integer.class);
		int value=response.getBody();
		return value;
	} 
	
	
	@GetMapping(value="/rangeNo/{a}/{b}")
	public List<Integer> rangeNo(@PathVariable int a,@PathVariable int b){
		String url="http://localhost:8080/sampleProjectController/rangeNo/"+a+"/"+b;
		ResponseEntity<List> response=rest.exchange(url,HttpMethod.GET,null,List.class);
		List<Integer> values=response.getBody();
		return values;	
	}
	
	

}