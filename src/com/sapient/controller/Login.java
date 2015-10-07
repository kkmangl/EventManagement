package com.sapient.controller;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.UserLoginInfo;

@Controller
public class Login {
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String LoginController(@ModelAttribute("user") UserLoginInfo userlogininfo){
		ModelAndView modelandview = new ModelAndView("logModel");
		return "login";
	} 
	
}
