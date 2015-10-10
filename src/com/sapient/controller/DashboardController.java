package com.sapient.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hibernate.DashBoard;
import com.sapient.hibernate.UpcomingEvent;
import com.sapient.model.Event;
import com.sapient.model.UserLoginInfo;

@Controller
public class DashboardController {
	
	@RequestMapping(value="/dashBoard", method= RequestMethod.GET)
	public String dashBoard(UserLoginInfo login, ModelMap model, HttpSession session){
		
		DashBoard dashboard=new DashBoard();
		String mnb = (String) session.getAttribute("logsesh");
		List eventList=dashboard.dashList(mnb);	

		model.addAttribute("eventlist", eventList);

		
		return "Dashboard";
	}
}
