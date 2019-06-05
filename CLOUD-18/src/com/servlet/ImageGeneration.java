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
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

/**
 * Servlet implementation class ImageGeneration
 */
@WebServlet("/ImageGeneration")
public class ImageGeneration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageGeneration() {
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
		
        System.out.println("welcome image generation page");
		
		String EmpID =request.getParameter("EmpID");
		System.out.println("EmpID ="+EmpID);
		
		String EmployName =request.getParameter("EmployName");
		System.out.println("EmployName ="+EmployName);
		
		Part part = null;
		
		FilePart filePart = null;
		//ParamPart paramPart = null;
		
		String type = null;
		
		double fileSize=0.0;
		
		String filename =null;
		
		ArrayList<String> paramvalues =new ArrayList<String>();
		
		MultipartParser mpp=new MultipartParser(request, 999999999);
		
		String realpath=getServletContext().getRealPath("/");
		
		System.out.println(realpath+"===I am Real Path");
		
		String path=realpath.substring(0,realpath.indexOf("."))+"CLOUD-18\\WebContent\\ImageGen\\";
		
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
		
		
			
		
		response.sendRedirect("ImageGenSuccess.jsp?filename="+filename+"&&path="+path+"&&EmpID="+EmpID+"&&EmployName="+EmployName);	
		
	}

}
