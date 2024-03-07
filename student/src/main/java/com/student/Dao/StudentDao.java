package com.student.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.student.Entity.Student;
import com.student.Repository.StudentRepository;

@Controller
public class StudentDao {

	@Autowired
	StudentRepository studentrepository;

	public String saveMulStudentDetails(Student s) {
		studentrepository.save(s);
		return "student details added Successfull";
	}

	public List<Student> getAllStudentDetails() {
		return studentrepository.findAll();
	}

	public String updateStudentNameByRollNumber(String name,int no) {
		studentrepository.updateStudentNameByRollNumber(name,no);
		return "Successfully updated";
	}
	
	public String deleteStudentDetailsByRollNo(int no) {
		studentrepository.deleteById(no);
		return "Deleted";		
	}

}