package com.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.Part;

/**
 * Servlet implementation class Employ_ProjectWork
 */
@WebServlet("/Employ_ProjectWork")
public class Employ_ProjectWork extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employ_ProjectWork() {
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
		
        System.out.println("welcome Employ_ProjectWork Page");
		
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
		
        Part part = null;
		
		FilePart filePart = null;
		
		String type = null;
		
		double fileSize=0.0;
		
		String filename =null;
		
		
		MultipartParser mpp=new MultipartParser(request, 999999999);
		
		String realpath=getServletContext().getRealPath("/");
		
		System.out.println(realpath+"===I am Real Path");
		
		String path=realpath.substring(0,realpath.indexOf("."))+"CLOUD-18\\WebContent\\EmployProjectWork\\";
		
        System.out.println("path ="+path);
        
      		
		while((part=mpp.readNextPart())!=null)
		{
			if(part.isFile())
			{
				filePart = (FilePart) part;
				
				path=path+filePart.getFileName();
				
				
				
				System.out.println("Full Path ="+path);
								
				filename=filePart.getFileName();
				
				File uploadedFile = new File(path);
				
				type = filePart.getContentType();
				
				fileSize = filePart.writeTo(uploadedFile);
											
			   }
					
			}
		
		response.sendRedirect("Employ_ImageGenSuccess.jsp?ProjectAllocation="+ProjectAllocation+"&&ProjectDescription="+ProjectDescription+"&&EmpID="+EmpID+"&&EmployName="+EmployName+"&&Startdate="+Startdate+"&&Enddate="+Enddate+"&&filename="+filename+"&&path="+path);	
		
	}

}
