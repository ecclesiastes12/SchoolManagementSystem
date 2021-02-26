package org.ecc.services;

import org.ecc.repositories.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.ecc.entities.Student;

@Service
public class StudentServices {
	@Autowired
	private StudentRespository studentRespository;

	public void addStudent(Student student) {
		
		studentRespository.save(student);
		
		
	}

}
