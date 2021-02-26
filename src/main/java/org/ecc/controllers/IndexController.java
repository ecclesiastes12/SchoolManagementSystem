package org.ecc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.ecc.entities.Student;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String homepage() {
		
		return "views/index";
	}
	
	@RequestMapping("/login")
	public String showLoginForm() {
		return "views/loginForm";
	}

	/*
	 * @RequestMapping("/student") public String showLoginForm1() { return
	 * "views/student"; }
	 */
	
	/*
	 * @RequestMapping("/ ") //@PostMapping("/register") public String
	 * showStudentDetailsForm() {
	 * 
	 * 
	 * return "views/studentDetails"; }
	 */

}
