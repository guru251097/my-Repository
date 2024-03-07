package com.studentMarkSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentMarkSheet.Entity.Student;

public interface StudentMarkSheetRepository extends JpaRepository<Student,Integer>{

}
