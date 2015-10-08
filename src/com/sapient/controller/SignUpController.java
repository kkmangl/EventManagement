package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.UserSignUpInfo;

@Controller
public class SignUpController {
	
	@RequestMapping(value="/signUp", method = RequestMethod.GET)
	public ModelAndView signUp(@ModelAttribute("userSignUp") UserSignUpInfo newUserInfo){
		
		
		ModelAndView model = new ModelAndView("signUp");
		return model;
	}
}
