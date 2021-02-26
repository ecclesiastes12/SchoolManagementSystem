package org.ecc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.ecc.entities.Subject;
import org.ecc.services.SubjectsServices;

@Controller
public class SubjectController {

	@Autowired
	private SubjectsServices subjectServices;
	
	@RequestMapping("/courses")
	public String showSubjectForm(Model model) {
		model.addAttribute("subjects", new Subject());
		return "views/subjects";
	}
	
	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public String proccessSubjectForm(@Valid Subject subjects, BindingResult bindingResults) {
		if(bindingResults.hasErrors()) {
			return "views/subjects";
		}
		subjectServices.addSubject(subjects);
		return "views/success";
	}
	
	@RequestMapping("/listsubjects")
	public String showSubjectList(Model model) {
		model.addAttribute("subjects", subjectServices.findAllSubjects());
		return "views/subjectsList";
	}
}

