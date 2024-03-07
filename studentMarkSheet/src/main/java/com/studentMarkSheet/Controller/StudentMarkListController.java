package com.studentMarkSheet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentMarkSheet.Entity.Student;
import com.studentMarkSheet.Service.StudentMarkSheetService;

@RestController
@RequestMapping(value="/StudentMarkSheetController")
public class StudentMarkListController {
	
	@Autowired
	StudentMarkSheetService studentmarksheetservice;
	
	
	
	@GetMapping(value="/saveSemesterMark")
	public Student saveSemesterMark(@RequestBody Student s) {
		return studentmarksheetservice.saveSemesterMark(s);
	}

}