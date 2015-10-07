package com.sapient.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.model.EventModel;

/**
 * Servlet implementation class eventcontroller
 */
public class AddEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String eventdate = request.getParameter("eventdate");
		String venue = request.getParameter("venue");
		String description = request.getParameter("description");
		EventModel event=new EventModel();
		boolean status=false;
		try {
			try {
				status=event.addEvent(name,eventdate,venue,description);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			request.setAttribute("userbean",event);
			response.sendRedirect("Event.jsp");
		}
	}

}