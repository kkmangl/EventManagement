package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.sapient.model.*;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String username;
     
    public String getUsername() {
		return username;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UserLogin user = new UserLogin();
		HttpSession session=request.getSession();
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		
		boolean status = user.ValidateLogin(username, password);
		if (status) {
			//user.setUname(username);
			request.setAttribute("userBean", user);
			request.getRequestDispatcher("upcoming").include(request, response);
		}
		else {
			JOptionPane.showMessageDialog (null, "Sorry... Invalid Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
			request.getRequestDispatcher("index.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		UserLogin user = new UserLogin();
		boolean status = user.ValidateLogin(username, password);
		HttpSession session=request.getSession(true);
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		
		if (status) {
			user.setUname(username);
			request.setAttribute("userBean", user);
			request.getRequestDispatcher("upcoming").include(request, response);
		}
		else {
			JOptionPane.showMessageDialog (null, "Sorry... Invalid Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
			request.getRequestDispatcher("index.html").forward(request, response);
		}
	}

}
