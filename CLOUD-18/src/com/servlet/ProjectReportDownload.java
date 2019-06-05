package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjectReportDownload
 */
@WebServlet("/ProjectReportDownload")
public class ProjectReportDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectReportDownload() {
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
		
		String Filename =request.getParameter("Filename");
		
		System.out.println("Filename ="+Filename);
		
		String Workspacepath=getServletContext().getRealPath("");
		
		String FilePath=Workspacepath.substring(0, Workspacepath.indexOf("."))+"CLOUD\\WebContent\\EmployProjectReport\\";
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
	  
		  
		response.setContentType("APPLICATION/OCTET-STREAM");   
		response.setHeader("Content-Disposition","attachment; filename=\"" + Filename + "\"");   
		  
		FileInputStream fileInputStream = new FileInputStream(FilePath + Filename);  
		            
		int i;   
		while ((i=fileInputStream.read()) != -1) {  
		out.write(i);   
		}   
		fileInputStream.close();   
		out.close(); 
	}

}
