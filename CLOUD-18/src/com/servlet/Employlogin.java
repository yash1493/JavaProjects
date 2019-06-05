package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.UserRegisterPojo;

/**
 * Servlet implementation class Employlogin
 */
@WebServlet("/Employlogin")
public class Employlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employlogin() {
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
		
		System.out.println("welcome to Login page");
		
		String EmpID=request.getParameter("EmpID");
		
		System.out.println("EmpID ="+EmpID);
		
        String Password=request.getParameter("Password");
		
		System.out.println("Password ="+Password);
		
		HttpSession session =request.getSession();
		
		session.setAttribute("EmpID", EmpID);
		
		UserRegisterPojo ur =new UserRegisterPojo();
		
		ur.setEmpId(EmpID);
		
		ur.setPassword(Password);
		
		Interface in =new Implement();
		
		List list =in.login(ur);
		
		System.out.println(" ="+list.size());
		
		if(list.size()!=0)
		{
			System.out.println("sucess");
			
			response.sendRedirect("EmployWelcomePage.jsp");
		}
		else
		{
			System.out.println("failed");
			
			response.sendRedirect("EmployeLoginPageError.jsp");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
