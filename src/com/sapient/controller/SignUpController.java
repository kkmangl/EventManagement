package com.sapient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.UserSignUpInfo;

@Controller
public class SignUpController {
	
	@RequestMapping(value="/signUp", method = RequestMethod.GET)
	public ModelAndView signUp(@Valid @ModelAttribute("userSignUp") UserSignUpInfo newUserInfo, BindingResult result ){
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("signUpError");
			return model;
		}
		
		ModelAndView model = new ModelAndView("signUp");
		return model;
	}
}
