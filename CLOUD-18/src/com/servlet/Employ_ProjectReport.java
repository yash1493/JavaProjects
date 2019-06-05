package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Implement.Implement;
import com.Interface.Interface;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
import com.pojoclass.ProjectReportPojo;
import com.pojoclass.ShiftAllocationPojo;



/**
 * Servlet implementation class Employ_ProjectReport
 */
@WebServlet("/Employ_ProjectReport")
public class Employ_ProjectReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employ_ProjectReport() {
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
		
        try
		
		{
        	
      
        
        String filename = null;
        
        String Finishingtime = null;
        	
		System.out.println("welcome Employ_ProjectReport Page");
		
		String EmpID =request.getParameter("EmpID");
		
		System.out.println("EmpID ="+EmpID);
		
		String EmployName =request.getParameter("EmployName");
		
		System.out.println("EmployName ="+EmployName);
		
		String ProjectAllocation =request.getParameter("ProjectAllocation");
		
		System.out.println("ProjectAllocation ="+ProjectAllocation);
		
		String ProjectDescription =request.getParameter("ProjectDescription");
		
		System.out.println("ProjectDescription ="+ProjectDescription);
		
		String Startdate =request.getParameter("Startdate");
		
		System.out.println("Startdate ="+Startdate);
		
        String Enddate =request.getParameter("Enddate");
		
		System.out.println("Enddate ="+Enddate);
		
        String finishingdate =request.getParameter("finishingdate");
		
		System.out.println("finishingdate ="+finishingdate);
		
		String Fullpath = request.getParameter("Fullpath");

		System.out.println("Fullpath =" + Fullpath);

		String filename1 = request.getParameter("filename");

		System.out.println("filename1 =" + filename1);
    	
		
		ProjectReportPojo prp = new ProjectReportPojo();
		
		prp.setEmployeeID(EmpID);
		
		prp.setEmployeeName(EmployName);
		
		prp.setProjectAllocation(ProjectAllocation);
		
		prp.setProjectDescription(ProjectDescription);
		
		prp.setStartDate(Startdate);
		
        prp.setEndDate(Enddate);
        
        prp.setChooseReport(Fullpath);
		
		prp.setFinishedDate(finishingdate);
		
		prp.setFilename(filename1);
		
        Interface in =new Implement();
		
		int i =in.ProjectReport(prp);
		
		if(i >= 1)
		{
			System.out.println("process sucess");
			
			response.sendRedirect("ProjectReportSucess.jsp");
		}
		else
		{
			System.out.println("process failed");
			
			response.sendRedirect("index.jsp");
		}
		
		}catch(Exception e)
		{
			System.out.println(e);
			
			e.printStackTrace();
            
		}
	}

}
