package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.PerformencePojo;

/**
 * Servlet implementation class PerformenceStatus
 */
@WebServlet("/PerformenceStatus")
public class PerformenceStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PerformenceStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("welcome PerformenceStatus Page");

		String performence = request.getParameter("performence");

		System.out.println("performence =" + performence);

		String EmpID = request.getParameter("EmpID");

		System.out.println("EmpID =" + EmpID);
		
		String EmployName = request.getParameter("EmployName");

		System.out.println("EmployName =" + EmployName);
		
		String ProjectAllocation = request.getParameter("ProjectAllocation");

		System.out.println("ProjectAllocation =" + ProjectAllocation);
		
		String ProjectDescription = request.getParameter("ProjectDescription");

		System.out.println("ProjectDescription =" + ProjectDescription);
		
		String Startdate = request.getParameter("Startdate");

		System.out.println("Startdate =" + Startdate);
		
		String Enddate = request.getParameter("Enddate");

		System.out.println("Enddate =" + Enddate);
		
		String ProjectReport = request.getParameter("ProjectReport");

		System.out.println("ProjectReport =" + ProjectReport);
		
		String FinishingDate = request.getParameter("FinishingDate");

		System.out.println("FinishingDate =" + FinishingDate);
		
		PerformencePojo p =new PerformencePojo();
		
		p.setEmpId(EmpID);
		
		p.setEmployeeName(EmployName);
		
		p.setProjectAllocation(ProjectAllocation);
		
		p.setProjectDescription(ProjectDescription);
		
		p.setStartDate(Startdate);
		
		p.setEndDate(Enddate);
		
		p.setProjectReport(ProjectReport);
		
		p.setFinishingDate(FinishingDate);
		
		p.setPerformenceStatus(performence);
		
		Interface in =new Implement();
		
		int i =in.Performence(p);
		
		if(i >= 1)
		{
			System.out.println("process success");
			
			response.sendRedirect("PerformenceStatusSuccess.jsp");
		}
		else
		{
			System.out.println("process Failed");
			
			response.sendRedirect("index.jsp");
		}
	}

}
