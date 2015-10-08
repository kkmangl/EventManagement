package com.sapient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.UserLoginInfo;;

@Controller
public class Login {
	
	@RequestMapping(value="/login",  method= RequestMethod.POST)
	public ModelAndView LoginControl(@Valid @ModelAttribute("user") UserLoginInfo userlogin, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("userLoginError");
			return model;
		}
		
		ModelAndView model = new ModelAndView("userLogin");
		return model;
	}
}
