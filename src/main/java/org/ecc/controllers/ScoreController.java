package org.ecc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScoreController {
	
	
	  @RequestMapping("/scores")
	  public String showScoreForm() {
	  
	  return "views/scoreForm"; }
	  
	  @RequestMapping("/viewscores") 
	  public String showScore() {
		  
		  return "views/scoreTable"; }
	 

}
