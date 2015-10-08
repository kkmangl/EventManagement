package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public ModelAndView HomePage(){
		
		
		ModelAndView model = new ModelAndView("profile");
		return model;
	}
}
