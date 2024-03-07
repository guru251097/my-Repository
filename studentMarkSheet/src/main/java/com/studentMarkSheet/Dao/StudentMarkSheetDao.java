package com.studentMarkSheet.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentMarkSheet.Entity.Student;
import com.studentMarkSheet.Repository.StudentMarkSheetRepository;

@Repository
public class StudentMarkSheetDao {
	
	@Autowired
	StudentMarkSheetRepository studentmarksheetrepository;
	
	public Student saveSemesterMark(Student s) {
		return studentmarksheetrepository.save(s);
		
	}
	

}
