package com.example.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleProjectController")
public class FirstClass {
	@GetMapping("/getName")
	public String getName() {
		return "guru".toUpperCase();
	}
	
	@PostMapping("/addNos")
	public int addNos(@RequestParam int a1,@RequestParam int b) {
		return a1+b;
	}
	
	@GetMapping("/belowTen/{a}")
	public List<Integer> belowTen(@PathVariable("a") int num){//get value in one way
		List<Integer> a=new ArrayList<>();
		List<Integer> li=Arrays.asList(10,20,30,4,6,2,34,2);
		for(Integer l:li) {
			if(l<num) {
				a.add(l);
			}
		}
		return a;	
	 }
	
	@GetMapping("/addTwoNumber/{a}/{b}")
	public int addTwoNumber(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	
	 
	@GetMapping("/rangeNo/{num}/{num1}")
public List<Integer> rangeNo(@PathVariable int num,@PathVariable int num1){//get value in another way
		List<Integer> a=new ArrayList<>();
		List<Integer> li=Arrays.asList(10,20,30,4,6,2,34,2);
		for(Integer l:li) {
			if(l>num && l<num1) {
				a.add(l);
			}
		}
		return a;
	}

}