package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.model.UserLogin;
import com.sapient.model.transaction;

/**
 * Servlet implementation class TransactionServlet
 */
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		String[] eventid=request.getParameterValues("transact");
		transaction trans=new transaction();
		
		
		HttpSession session=request.getSession();
		String name = (String) session.getAttribute("username");
		//System.out.println(name);
		boolean status=trans.addEvent(eventid,name);
		if(status)
		{
			request.setAttribute("userbean",trans);
			request.getRequestDispatcher("transact.jsp").forward(request, response);
		}
		
		
	}

}
