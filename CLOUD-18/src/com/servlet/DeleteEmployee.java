package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.UserRegisterPojo;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Interface in;
	
	UserRegisterPojo ur;
	
	
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("welcome to Delete Employee page");

			String EmpID = request.getParameter("EmpID");

			System.out.println("EmpID =" + EmpID);

			String EmployName = request.getParameter("EmployName");

			System.out.println("EmployName =" + EmployName);
			
			ur=new UserRegisterPojo();
			
			ur.setEmpId(EmpID);
			
			ur.setEmployName(EmployName);
			
			in=new Implement();
			
			int i=in.DeleteEmp(ur);
			
			if (i >= 1) 
			{
				System.out.println("Deletion sucess");
				
				response.sendRedirect("EmployDetails.jsp");
				
			} else 
			{
				System.out.println("process failed");
				
				response.sendRedirect("EmployDetails.jsp");
			}
		}
		catch(Exception e){
			System.out.println("ERROR in deletion! ");
			response.sendRedirect("DeleteEmploy.jsp");
		}
	}

}
