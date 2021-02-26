package org.ecc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.ecc.entities.Student1;
import org.ecc.services.StudentServices1;

@Controller
public class StudentController1 {
	@Autowired
	private StudentServices1 studentServices;
	
	
	@RequestMapping(value="/register1")
	//@GetMapping("/register")
	public String getStudentForm(Model model) {
		model.addAttribute("student", new Student1());
		return "views/student";
	}
	
	
	@RequestMapping(value="/register1", method=RequestMethod.POST)
	//@PostMapping("/register")
	public String processStudentForm(@Valid Student1 student, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "views/student";
		}
		
		studentServices.addStudent(student);
		return "views/success";
	}
	
	@RequestMapping("/studentinfo")
	public String studentInfo() {
		
		return "views/studentInfoForm";
	}

}
