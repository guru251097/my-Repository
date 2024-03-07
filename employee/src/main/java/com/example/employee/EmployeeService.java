package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeedao;
	
	public List<Employee> getAllEmployee(){
		return employeedao.getAllEmployee();
	}
	
	public String createEmployee(Employee e) {
		return employeedao.createEmployee(e);
	}
	
	public Optional<Employee> findOneEmployeeById(int id) {
		return employeedao.findOneEmployeeById(id);
	}
	
	public List<Employee> findAllEmployee() {
		return employeedao.findAllEmployee();
	}
	public String deleteById(int id) {
		return employeedao.deleteById(id);
	}
	public String deleteAllEmployee() {
		return employeedao.deleteAllEmployee();
	}
	public String updateById(int a,Employee e) {
		return employeedao.updateById(a, e);
	}
	
	
	
	

}
