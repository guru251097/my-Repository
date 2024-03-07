package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return employeeservice.getAllEmployee();
	}
	
	@PostMapping("/createEmployee")
	public String createEmployee(@RequestBody Employee e) {
		return employeeservice.createEmployee(e);
	}
	@PostMapping("/saveMultipleValues")
	public String saveMultipleValues(@RequestBody Employee e) {
		return employeeservice.createEmployee(e);
	}
	
	
	@GetMapping("/findOneEmployeeById/{id}")
	public Optional<Employee> findOneEmployeeById(@PathVariable("id") int id) {
		return employeeservice.findOneEmployeeById(id);
	}
	
	@GetMapping("/findAllEmployee")
	public List<Employee> findAllEmployee() {
		return employeeservice.findAllEmployee();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable("id") int id) {
		return  employeeservice.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllEmployee")
	public String deleteAllEmployee() {
		return employeeservice.deleteAllEmployee();
	}
	@PutMapping("/updateById/{i}")
	public String updateById(@PathVariable int i,@RequestBody Employee e) {
		return employeeservice.updateById(i, e);
	}
	
	
	

}