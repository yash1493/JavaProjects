package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.ShiftAllocationPojo;

/**
 * Servlet implementation class ShiftAllocatedModifiedInput
 */
@WebServlet("/ShiftAllocatedModifiedInput")
public class ShiftAllocatedModifiedInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Interface in;

	ShiftAllocationPojo sa;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShiftAllocatedModifiedInput() {
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

		try

		{

			System.out.println("welcome to ShiftAllocatedModifiedInput page");

			String EmpID = request.getParameter("EmpID");

			System.out.println("EmpID =" + EmpID);

			String EmployName = request.getParameter("EmployName");

			System.out.println("EmployName =" + EmployName);

			String ShiftDuration = request.getParameter("ShiftDuration");

			System.out.println("ShiftDuration =" + ShiftDuration);

			String ShiftName = request.getParameter("ShiftName");

			System.out.println("ShiftName =" + ShiftName);

			String ShiftTiming = request.getParameter("ShiftTiming");

			System.out.println("ShiftTiming =" + ShiftTiming);

			sa = new ShiftAllocationPojo();

			sa.setEmpID(EmpID);

			sa.setEmployName(EmployName);

			sa.setShiftName(ShiftName);

			in = new Implement();

			int i = in.shiftUpdate(sa);

			if (i >= 1) 
			{
				System.out.println("process sucess");
				
				response.sendRedirect("ShiftAllocatedDetails.jsp");
				
			} else 
			{
				System.out.println("process failed");
				
				response.sendRedirect("");
			}

		} catch (Exception e) 
		{
			System.out.println("eee");

		}
	}

}
