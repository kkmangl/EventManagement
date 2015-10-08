package com.sapient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Email {
	@RequestMapping(value="/forget", method = RequestMethod.GET)
	public ModelAndView emailController(@Valid @ModelAttribute() Email userEmail){
		
		
		
		ModelAndView model = new ModelAndView("ForgetEmail");
		return model;
	}
}
