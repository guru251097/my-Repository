package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;
import com.student.Exception.AgeException;
import com.student.Service.StudentService;

@RestController
@RequestMapping(value = "/studentController")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping(value = "/saveMulStudentDetails")
	public String saveMulStudentDetails(@RequestBody List<Student> s) throws AgeException {
		return studentService.saveMulStudentDetails(s);
	}

	@GetMapping(value = "/getAllStudentDetails")
	public List<Student> getAllStudentDetails() {
		return studentService.getAllStudentDetails();
	}

	@PutMapping(value = "/updateStudentNameByRollNumber")
	public String updateStudentNameByRollNumber(@PathVariable String name,@PathVariable int no) {
		return studentService.updateStudentNameByRollNumber(name,no);
	}
	
	@DeleteMapping(value="/deleteStudentDetailsByRollNo")
	public String deleteStudentDetailsByRollNo(@PathVariable int no) {
		return studentService.deleteStudentDetailsByRollNo(no);
	}
	

//Create the spring starter project with the name of StudentResults
//By using RestTemplate,
//
// Get the services from the above created two projects.
// Find the overall total.
// Add 5 marks for the students who got 90% in attendance and total should not exceed 100.
// Convert the total into percentage
// Create the entity class, 
//            Entity name: Results
//
//            Properties: id, rollNumber, name, totalMarks, percentage
//
//            Table name: results
//
// Assign the values for the required four properties from the manipulated data and store it in the DB
// Provide a service to get topper.
// Provide a service to get Top three rankers
// Provide a service to get students by range of marks like students who scored between 70 and 90.
//RESULTS
//
//ID	ROLL_NUMBER    	NAME	TOTAL (SEM_1_TOTAL + SEM_2_TOTAL / 2)	PERCENTAGE
// 	 	 	 	 
// 	 	 	 	 
//*All the applications must contain four layers (Controller, Service, Repository and Dao)
//*All the applications must have all the http methods (post, get, put, delete)
	

}
