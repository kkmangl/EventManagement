package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hibernate.AuthenticateLogin;
import com.sapient.hibernate.UpcomingEvent;
import com.sapient.model.UserLoginInfo;

import org.hibernate.HibernateException;

@Controller

public class LoginController {
	
	@RequestMapping(value="/verify", method = RequestMethod.POST)
	public String loginPage(UserLoginInfo login) {
		AuthenticateLogin authenticateLogin=new AuthenticateLogin();
		boolean status=authenticateLogin.verifyUser(login.getUsername(), login.getPassword());
		if(status){
			UpcomingEvent upcoming=new UpcomingEvent();
			List eventList=upcoming.getEvents(login.getUsername());
			
			return "home";
		}
		return "index";
	}
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView fetchLoginPage() {
		return new ModelAndView("index", "command", new UserLoginInfo());
	}
}