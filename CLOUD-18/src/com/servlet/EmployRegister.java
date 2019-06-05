package com.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.UserRegisterPojo;

/**
 * Servlet implementation class EmployRegister
 */
@WebServlet("/EmployRegister")
public class EmployRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployRegister() {
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
		
		System.out.println("Welcome Employ Register Page");
		
        String EmployeeID =request.getParameter("EmployeeID");
		
		System.out.println("EmployeeID ="+EmployeeID);
		
        String EmployeeName =request.getParameter("EmployeeName");
		
		System.out.println("EmployeeName ="+EmployeeName);
		
        String Password =request.getParameter("Password");
		
		System.out.println("Password ="+Password);
		
        String ConfPassword =request.getParameter("ConfPassword");
		
		System.out.println("ConfPassword ="+ConfPassword);
		
        String Salary =request.getParameter("Salary");
		
		System.out.println("Salary ="+Salary);
		
        String DateOfBirth =request.getParameter("DateOfBirth");
		
		System.out.println("DateOfBirth ="+DateOfBirth);
		
        String MobileNumber =request.getParameter("MobileNumber");
		
		System.out.println("MobileNumber ="+MobileNumber); 
		
        String Address =request.getParameter("Address");
		
		System.out.println("Address ="+Address); 
		
		Random r =new Random();
		
		String Values="0123456789ABCDE";
		
		char S1 =Values.charAt(r.nextInt(Values.length()));
		char S2 =Values.charAt(r.nextInt(Values.length()));
		char S3 =Values.charAt(r.nextInt(Values.length()));
		char S4 =Values.charAt(r.nextInt(Values.length()));
		char S5 =Values.charAt(r.nextInt(Values.length()));
		
		String SecretKey =""+S1+S2+S3+S4+S5;
		
		System.out.println("SecretKey ="+SecretKey);
		
		UserRegisterPojo ur =new UserRegisterPojo();
		
		ur.setEmpId(EmployeeID);
		
		ur.setEmployName(EmployeeName);
		
		ur.setPassword(Password);
		
		ur.setConfPassword(ConfPassword);
		
		ur.setSalary(Salary);
		
		ur.setDateOfBirth(DateOfBirth);
		
		ur.setMobileNumber(MobileNumber);
		
		ur.setAddress(Address);
		
		ur.setSecretKey(SecretKey);
		
		Interface in =new Implement();
		
		int i =in.register(ur);
		
		if(i >=1)
		{
            System.out.println("Successfully Inserted");
			
			List list =in.getUsername(ur);
			
			Iterator it =list.iterator();
			
			String UserSecretKey = null;
			
			while(it.hasNext())
			{
				UserRegisterPojo ur1 =(UserRegisterPojo) it.next();
				
				UserSecretKey =ur1.getSecretKey();
				
				System.out.println("UserSecretKey ="+UserSecretKey);
			}
			
			JOptionPane pane = new JOptionPane("Hi ! You are Successfully Registered");
			
			JDialog dialog =pane.createDialog("Message");
			
			dialog.setAlwaysOnTop(true);
			
			dialog.setVisible(true);
			
		   
			JOptionPane.showMessageDialog(null, "Your Secret key is "+UserSecretKey);
			
			response.sendRedirect("EmployLogin.jsp");
		}
		else
		{
			System.out.println("Process Failed");
		
			response.sendRedirect("EmployRegister.jsp");
		}
	}

}
