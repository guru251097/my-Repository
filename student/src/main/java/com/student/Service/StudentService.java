package com.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Dao.StudentDao;
import com.student.Entity.Student;
import com.student.Exception.AgeException;

@Service
public class StudentService {
	@Autowired
	StudentDao studentdao;

	public String saveMulStudentDetails(List<Student> s) throws AgeException{
		for (Student x : s) {
			if (x.getAge() > 18) {
			   studentdao.saveMulStudentDetails(x);
			}else {
				throw new AgeException("age must be above 18 for id no "+x.getRollNumber());
			}
		}
		return "saved";
		
	}

	public List<Student> getAllStudentDetails() {
		return studentdao.getAllStudentDetails();
	}

	public String updateStudentNameByRollNumber(String name, int no) {
		return studentdao.updateStudentNameByRollNumber(name, no);
	}

	public String deleteStudentDetailsByRollNo(int no) {
		return studentdao.deleteStudentDetailsByRollNo(no);
	}

}