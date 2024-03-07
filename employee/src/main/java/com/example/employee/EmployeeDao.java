package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo employeerepo;
	
	public List<Employee> getAllEmployee(){
		return employeerepo.findAll();
	}
	public String createEmployee(Employee e) {
		 employeerepo.save(e);
		 return "Success";
	}
	
	public Optional<Employee> findOneEmployeeById(int id) {
		return employeerepo.findById(id);
	}
	public String deleteById(int id) {
		employeerepo.deleteById(id);
		return "deleted";
	}
	public List<Employee> findAllEmployee(){
		return employeerepo.findAll();
	}
	public String deleteAllEmployee() {
	    employeerepo.deleteAll();
	    return "all details deleted";
	}
	
	public String updateById( int i,Employee e) {
		Employee s= employeerepo.findById(i).get();
		s.setName(e.getName());
		s.setDesignation(e.getDesignation());
		employeerepo.save(s);
		return "Updated";
	}

}