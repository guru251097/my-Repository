package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	
	@Query(value="update student set name=? where roll_number=?",nativeQuery=true)
	public String updateStudentNameByRollNumber(String name,int no);
	
	

}
