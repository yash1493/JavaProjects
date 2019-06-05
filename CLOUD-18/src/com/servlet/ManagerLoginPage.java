package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/ManagerLoginPage")
public class ManagerLoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerLoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Our Login Page");
		
		String Username =request.getParameter("UserName");
		
		System.out.println("Username ="+Username);
		
        String Password =request.getParameter("Password");
		
		System.out.println("Password ="+Password);
		
		if(Username.equals("admin") && Password.equals("admin"))
		{
			System.out.println("Condition Matched");
			
			response.sendRedirect("ManagerWelcomePage.jsp");
		}
		else
		{
			System.out.println("Condition Mis-matched");
			
			response.sendRedirect("Man_LoginPageError.jsp");
		}
	}

}
