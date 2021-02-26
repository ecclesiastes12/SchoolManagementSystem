package org.ecc.services;

import org.ecc.repositories.StudentRespository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.ecc.entities.Student1;

@Service
public class StudentServices1 {
	@Autowired
	private StudentRespository1 studentRespository;

	public void addStudent(Student1 student) {
		
		studentRespository.save(student);
		
		
	}

}
