package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hibernate.AddEvent;
import com.sapient.model.Event;
import com.sapient.model.UserLoginInfo;

@Controller
public class AddEventController {
	@RequestMapping(value="/addingEvent",method=RequestMethod.POST)
	public String AddEvent(Event event,ModelMap model)
	{
		AddEvent addEvent=new AddEvent();
		boolean status=addEvent.add(event);
		return "Event";
	}
	
	@RequestMapping(value="/addEvent", method = RequestMethod.GET )
	public ModelAndView AddNewEvent(){
		
		return new ModelAndView("AddEvent", "addevent", new Event());
	}
}
