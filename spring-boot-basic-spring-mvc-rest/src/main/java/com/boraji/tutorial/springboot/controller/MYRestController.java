package com.boraji.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MYRestController {
	

	 @GetMapping("/Myrestexample1")
	   public Test index2() {
 
		 Test test = new Test();
		 test.setI(78);
		 test.setName("rajiii");
		 return test;
	   }
	    
	    @GetMapping("/Myrestexample")
		   public String index() {
		      return "HIIIIIII";
		   }

}



class Test {
	
	int i; 	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	 


	
	
}