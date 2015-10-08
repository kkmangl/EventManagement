package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class About {

	@RequestMapping(value="/AboutUs", method= RequestMethod.GET)
	public ModelAndView AboutUs(){
		
		
		ModelAndView model = new ModelAndView("AboutUs");
		return model;
	}
	
}
