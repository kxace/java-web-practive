package com.seanco.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		model.addAttribute("countryOptions", countryOptions);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println("student: " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
