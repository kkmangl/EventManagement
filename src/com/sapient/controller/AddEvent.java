package com.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.NewEvent;

@Controller
public class AddEvent {
	
	@RequestMapping(value="/addEvent", method = RequestMethod.POST )
	public ModelAndView AddNewEvent(@ModelAttribute() NewEvent newevent){
		
		ModelAndView model = new ModelAndView("AddEvent");
		return model;
	}
}
