package com.sapient.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hibernate.InsertEvent;
import com.sapient.model.UserLoginInfo;

@Controller

public class JoinEventController {
	@RequestMapping(value="/parameter", method = RequestMethod.POST)
	public String addEventJoining(@RequestParam("eid") int eventid, HttpSession session)
	{
		String mnb = (String) session.getAttribute("logsesh");
		InsertEvent insertEvent=new InsertEvent();
		insertEvent.insertEvent(eventid, mnb);
		 
		 return "redirect:redirect";
		//return "home";
	}
	

}
