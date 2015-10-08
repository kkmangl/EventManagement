package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.sapient.model.UserLoginInfo;;

@Controller
public class Login {
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public ModelAndView LoginController(){
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	/*@RequestMapping(value="/login",  method= RequestMethod.POST)
	public ModelAndView LoginControl(@ModelAttribute("user") UserLoginInfo userlogin){
		ModelAndView model = new ModelAndView("userLogin");
		return model;
	}*/
}
