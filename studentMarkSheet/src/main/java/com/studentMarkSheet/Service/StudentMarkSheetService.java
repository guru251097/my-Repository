package com.studentMarkSheet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentMarkSheet.Dao.StudentMarkSheetDao;
import com.studentMarkSheet.Entity.Student;

@Service
public class StudentMarkSheetService {
	
	@Autowired
	StudentMarkSheetDao studentmarksheetdao;
	
	public Student saveSemesterMark(Student s) {
		
		int sem1Total=s.getSem1Practicals()+s.getSem1Theory();
		int sem2Total=s.getSem2Practicals()+s.getSem2Theory();
		s.setSem1Total(sem1Total);
		s.setSem2Total(sem2Total);
		
		return studentmarksheetdao.saveSemesterMark(s);
	}
	

}
