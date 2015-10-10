package com.sapient.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hibernate.AuthenticateLogin;
import com.sapient.hibernate.UpcomingEvent;
import com.sapient.model.Event;
import com.sapient.model.UserLoginInfo;

@Controller

public class LoginController {
	
	@RequestMapping(value="/redirect",method=RequestMethod.GET)
	public ModelAndView HomeRedirect(ModelMap model, HttpSession session)
	{
		String username=(String)session.getAttribute("logsesh");
		UpcomingEvent upcoming=new UpcomingEvent();
		List eventList=upcoming.getEvents(username);		
		model.addAttribute("eventlist", eventList);		
		ModelAndView modelAndView = new ModelAndView("home","command",new UserLoginInfo());
		return modelAndView;
	}
	
	
	@RequestMapping(value="/verify", method = RequestMethod.POST)
	public ModelAndView loginPage(UserLoginInfo login, ModelMap model, HttpSession session) {
		AuthenticateLogin authenticateLogin=new AuthenticateLogin();
		boolean status=authenticateLogin.verifyUser(login.getUsername(), login.getPassword());
		if(status){
			UpcomingEvent upcoming=new UpcomingEvent();
			List eventList=upcoming.getEvents(login.getUsername());	
			Event event=new Event();	
			model.addAttribute("eventlist", eventList);		
			ModelAndView modelAndView = new ModelAndView("home","command",new UserLoginInfo());
			session.setAttribute("logsesh", login.getUsername());
			return modelAndView;
		}
		return new ModelAndView("index","command", new UserLoginInfo());
	}
	
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView fetchLoginPage() {
		return new ModelAndView("index", "command", new UserLoginInfo());
	}
	
	@RequestMapping(value="/invalidate", method = RequestMethod.GET)
	public ModelAndView invalidatePage(HttpSession session) {
		session.invalidate();
		return new ModelAndView("index", "command", new UserLoginInfo());
	}
}