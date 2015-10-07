package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.sapient.model.Dashboard;
import com.sapient.model.UserLogin;

/**
 * Servlet implementation class DashboardServlet
 */
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dashboard dashboard=new Dashboard();
		
		HttpSession session=request.getSession();
		String username = (String) session.getAttribute("username");
		boolean status=dashboard.getEvents(username);
		if(status)
		{
			request.setAttribute("userbean",dashboard);
			request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
		}
		else
		{
			JOptionPane.showMessageDialog (null, "Sorry...You have not selected any event", "Login Error", JOptionPane.ERROR_MESSAGE);
			request.getRequestDispatcher("upcoming").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		Dashboard dashboard=new Dashboard();
//		
//		HttpSession session=request.getSession();
//		String username = (String) session.getAttribute("username");
//		boolean status=dashboard.getEvents(username);
//		if(status)
//		{
//			request.setAttribute("userbean",dashboard);
//			request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
//		}
//		else
//		{
//			JOptionPane.showMessageDialog (null, "Sorry... Invalid Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
//			request.getRequestDispatcher("Home.jsp").forward(request, response);
//		}
		
	}

}
