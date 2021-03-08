package com.seanco.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		String result = "YO! " + name.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")
	public String letsShoutDudeV3(
			@RequestParam("studentName") String studentName,
			HttpServletRequest request,
			Model model) {		
		String result = "Hey my friend from V3! " + studentName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
