package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.ProjectAllocationPojo;

/**
 * Servlet implementation class ProjectAllocation
 */
@WebServlet("/ProjectAllocation")
public class ProjectAllocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectAllocation() {
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
		
		System.out.println("welcome project Allocation page");
		
		String EmpID =request.getParameter("EmpID");
		System.out.println("EmpID ="+EmpID);
		
		String EmployName =request.getParameter("EmployName");
		System.out.println("EmployName ="+EmployName);
		
		String ProjectAllocation =request.getParameter("filename");
		System.out.println("ProjectAllocation ="+ProjectAllocation);
		
		
		String ProjectDescription =request.getParameter("Fullpath");
		System.out.println("ProjectDescription ="+ProjectDescription);
		
		
		String Startdate =request.getParameter("Startdate");
		System.out.println("Startdate ="+Startdate);
		
		String Enddate =request.getParameter("Enddate");
		System.out.println("Enddate ="+Enddate);
		
		ProjectAllocationPojo pa =new ProjectAllocationPojo();
		
		pa.setEmpID(EmpID);
		
		pa.setEmployName(EmployName);
		
		pa.setProjectAllocation(ProjectAllocation);
		
		pa.setProjectDescription(ProjectDescription);
		
		pa.setStartdate(Startdate);
		
		pa.setEnddate(Enddate);
		
		Interface in =new Implement();
		
		int i = in.projectAllocation(pa);
		
		if(i >= 1)
		{
			System.out.println("process sucess");
			
			response.sendRedirect("ProjectAllocationSucess.jsp");
		}
		else
		{
			System.out.println("process failed");
			
			response.sendRedirect("index.jsp");
		}
		
		
		
	}

}
