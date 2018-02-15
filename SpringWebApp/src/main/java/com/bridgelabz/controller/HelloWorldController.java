package com.bridgelabz.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController 
{
	@RequestMapping("/hello")
	public String helloWorld() 
	{
		return "welcome to Spring first application";
		//return new ModelAndView("hello","MessageKey",message);
		
	}
}
