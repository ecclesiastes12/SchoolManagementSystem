package org.ecc.services;

import java.util.List;

import org.ecc.repositories.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.ecc.entities.Subject;

@Service
public class SubjectsServices {

	@Autowired
	private SubjectsRepository subjectsRepository;
	
	public void addSubject(Subject subjects) {
		subjectsRepository.save(subjects);
	}

	public List<Subject> findAllSubjects() {
		
		return subjectsRepository.findAll();
	}
	
	
	

}
