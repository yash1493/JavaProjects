package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Implement.Implement;
import com.Interface.Interface;
import com.pojoclass.UserRegisterPojo;

@WebServlet("/ForgotKey")
public class ForgotKey extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Interface in;
	UserRegisterPojo ur;
	
    public ForgotKey() {
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
	
	Random r =new Random();
	
	String Values="0123456789ABCDE";
	
	char S1 =Values.charAt(r.nextInt(Values.length()));
	char S2 =Values.charAt(r.nextInt(Values.length()));
	char S3 =Values.charAt(r.nextInt(Values.length()));
	char S4 =Values.charAt(r.nextInt(Values.length()));
	char S5 =Values.charAt(r.nextInt(Values.length()));
	
	String SecretKey1 =""+S1+S2+S3+S4+S5;
	
	System.out.println("welcome to Forgot Key page");

	String EmpId = request.getParameter("EmpID");

	System.out.println("EmpID =" + EmpId);

	String EmployName = request.getParameter("EmployName");

	System.out.println("EmployName =" + EmployName);
	
	String MobNo=request.getParameter("MobileNumber");
	
	System.out.println("Mobile Number =" + MobNo);
	
	String MobNo1 = JOptionPane.showInputDialog("Verify your Mobile Number: ");
	System.out.println("Mob No:"+ MobNo);
	System.out.println("Entered Mob No:"+ MobNo1);
	if(MobNo.equals(MobNo1)==true){
		
		JOptionPane pane = new JOptionPane("Verification Successful !"); 
		JDialog dialog = pane.createDialog("Message");
		dialog.setAlwaysOnTop(true);  
        dialog.show();
		
	ur=new UserRegisterPojo();
	//System.out.println("Hello1");
	ur.setSecretKey(SecretKey1);
	ur.setEmpId(EmpId);
	//System.out.println("Hello2");
	in = new Implement();
	//System.out.println("Hello3");
	int i = in.UpdateKey(ur);
	//System.out.println("Hello4");
	if (i >= 1) 
	{
		JOptionPane.showMessageDialog(null, "Your New Secret Key is -"+SecretKey1);
		System.out.println("Your New Secret Key: "+SecretKey1);
		
		System.out.println("Key Update sucess");
		
		response.sendRedirect("EmployWelcomePage.jsp");
		
	} else 
	{
		System.out.println("process failed");
		
		response.sendRedirect("EmployWelcomePage.jsp");
	}
	}else{
		JOptionPane pane1 = new JOptionPane("Wrong Mobile Number !"); 
		JDialog dialog1 = pane1.createDialog("Alert");
		dialog1.setAlwaysOnTop(true);  
        dialog1.show(); 
		
		response.sendRedirect("EmployWelcomePage.jsp");
	}
	
	
			
		 
		
}
		catch(Exception e){
			System.out.println("process failed 123");
			response.sendRedirect("EmployWelcomePage.jsp");
		}
		
	}

}
