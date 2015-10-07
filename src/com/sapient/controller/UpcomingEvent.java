package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.sapient.model.UpcomingEventList;
import com.sapient.model.UserLogin;

/**
 * Servlet implementation class UpcomingEvent
 */
public class UpcomingEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String username;
    
    public String getUsername() {
		return username;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public UpcomingEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UpcomingEventList uel = new UpcomingEventList();
		HttpSession session=request.getSession();
		String username = (String) session.getAttribute("username");
		boolean showlist = uel.showList(username);
		if(showlist) {
			request.setAttribute("userBean", uel);
			request.getRequestDispatcher("home.jsp").include(request, response);
		}
		else {
			JOptionPane.showMessageDialog (null, "Sorry... No List to show", "No Events", JOptionPane.INFORMATION_MESSAGE);
			request.getRequestDispatcher("index.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UpcomingEventList uel = new UpcomingEventList();
		
		//LoginServlet lgs = new LoginServlet();
		//username = lgs.getUsername();
		HttpSession session=request.getSession();
		String username = (String) session.getAttribute("username");
		boolean showlist = uel.showList(username);
		
		if(showlist) {
			request.setAttribute("userBean", uel);
			request.getRequestDispatcher("home.jsp").include(request, response);
		}
		else {
			JOptionPane.showMessageDialog (null, "Sorry... No List to show", "No Events", JOptionPane.INFORMATION_MESSAGE);
			request.getRequestDispatcher("index.html").forward(request, response);
		}
		
	}
}
