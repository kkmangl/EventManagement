package com.sapient.controller;

import javax.validation.Valid;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.Event;
import com.sapient.model.UserLoginInfo;
import com.sapient.model.UserSignUpInfo;
import com.sapient.hibernate.*;
@Controller
public class SignUpController {
	
	@RequestMapping(value="/addingUser", method = RequestMethod.POST)
	public ModelAndView AddUser(UserSignUpInfo userSign,ModelMap model)
	{
		AddUser user =  new AddUser();
		boolean status = user.add(userSign);
		return new ModelAndView("index", "command", new UserLoginInfo());
		
	}
	
	@RequestMapping(value="/signUp", method = RequestMethod.GET)
	public ModelAndView signUp(){
		
		return new ModelAndView("SignUp", "adduser", new UserSignUpInfo());
	}
}
