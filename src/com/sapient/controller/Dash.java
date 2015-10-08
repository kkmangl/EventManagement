package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Dash {
	
	@RequestMapping(value="/dashBoard", method= RequestMethod.GET)
	public ModelAndView dashBoard(){
		
		ModelAndView model = new ModelAndView("dashBoard");
		return model;
	}
}
