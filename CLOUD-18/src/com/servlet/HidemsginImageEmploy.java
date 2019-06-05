package com.servlet;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class HidemsginImage
 */
@WebServlet("/HidemsginImageEmploy")
public class HidemsginImageEmploy extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String EncryptedMsg1;

	/**
	 * Default constructor.
	 */

	public String Imagepath;
	public String Imagename;
	public String row;
	public String col;

	String realpath1;
	String filename;
	String EmpID;
	String EmployName;
	String Fullpath;
	String ProjectAllocation;
	String ProjectDescription;
	String Startdate;
	String Enddate;
	
	public HidemsginImageEmploy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try 
		{
			System.out.println("welcome HidemsginImageEmploy Page ");
		
            EmpID =request.getParameter("EmpID");
			
			System.out.println("EmpID ="+EmpID);
			
			EmployName =request.getParameter("EmployName");
			
			System.out.println("EmployName ="+EmployName);
			
			ProjectAllocation =request.getParameter("ProjectAllocation");
			
			System.out.println("ProjectAllocation ="+ProjectAllocation);
			
			ProjectDescription =request.getParameter("ProjectDescription");
			
			System.out.println("ProjectDescription ="+ProjectDescription);
			
			Startdate =request.getParameter("Startdate");
			
			System.out.println("Startdate ="+Startdate);
			
	        Enddate =request.getParameter("Enddate");
			
			System.out.println("Enddate ="+Enddate);
			
			
			Fullpath =request.getParameter("Fullpath");
				
		    System.out.println("Fullpath ="+Fullpath);
			
		    filename =request.getParameter("filename");
			
		    System.out.println("filename ="+filename);
	    
        
	    
	    String realpath=getServletContext().getRealPath("");
        
        System.out.println("realpath ="+realpath);
        
        realpath1 =realpath.substring(0, realpath.indexOf("."));
        
        System.out.println("realpath1 ="+realpath1);
		

		String Msg1 = JOptionPane.showInputDialog("Enter Your Project Report Details");
		
		System.out.println("Secret Msg1 =" + Msg1);
		
		
			
			EncryptedMsg1 =encryptdata.encrypt(Msg1);
			
			System.out.println("EncryptedMsg1 =" + EncryptedMsg1);
		
		
		
		JOptionPane.showMessageDialog(null, "Now Your message are Securely Encrypted -"+EncryptedMsg1);

		
		
		System.out.println("filename ="+filename);

		// String msg = " JAVA IS INDENPENDENT PLATFORM ORIENTED";

		// System.out.println("msg =" + msg);
		
         

		File file1 = new File(Fullpath);

		System.out.println("file1 =" + file1);

		FileInputStream fis1 = new FileInputStream(file1);

		BufferedImage bimg = ImageIO.read(fis1);

		System.out.println("bimg =" + bimg);

		// reading the image file

		stegnography(bimg, EncryptedMsg1, response);
		
        } catch (Exception e) {
			
			e.printStackTrace();
			
			response.sendRedirect("ProjectAllocation.jsp");
		}
	}

	public void stegnography(BufferedImage bimg, String msg,
			HttpServletResponse response) throws IOException, ServletException {

		int w = bimg.getWidth();

		int h = bimg.getHeight();

		// ***************************************
		// String msg="Hide this message:)";

		System.out.println("message=" + msg + " length=" + msg.length());

		// ***************************************

		if (msg.length() > 255) {

			System.out.println("MESSAGE IS LARGE THAN 255 CHARACTERS");

		} else if (msg.length() * 11 > w * h) {

			System.out.println("Image is too small");

		} else {

			// -------------------------------------------
			byte[] msgbytes = msg.getBytes();

			int msglendecode = (bimg.getRGB(0, 0) >> 8) << 8;

			msglendecode |= msg.length();
			bimg.setRGB(0, 0, msglendecode);// hidig msg length at first
											// position

			// System.out.println("\npixel at position (0,0) ");
			// bitpattern(bimg.getRGB(0,0) );

			for (int i = 1, msgpos = 0, row = 0, j = 0; row < h; row++) {
				for (int col = 0; col < w && j < msgbytes.length; col++, i++) {

					if (i % 11 == 0) {

						int rgb = bimg.getRGB(col, row);

						int a = ((rgb >> 24) & 0xff);

						int r = (((rgb >> 16) & 0xff) >> 3) << 3;
						r = r | (msgbytes[msgpos] >> 5);

						int g = (((rgb >> 8) & 0xff) >> 3) << 3;
						g = g | ((msgbytes[msgpos] >> 2) & 7);

						int b = ((rgb & 0xff) >> 2) << 2;
						b = b | (msgbytes[msgpos] & 0x3);

						rgb = 0;
						rgb = (rgb | (a << 24));
						rgb = (rgb | (r << 16));
						rgb = (rgb | (g << 8));

						rgb = (rgb | b);

						bimg.setRGB(col, row, rgb);

						msgpos++;
						j++;

						// bitpattern(bimg.getRGB(col,row));

					}

				}// for 2
			}// for 1

			ImageIcon image = new ImageIcon(bimg);
			System.out.println(image);

			

				// File outputfile = new
				// File("c:/Users/yathestha/Documents/"+filename);
				
				String FullpathImage=realpath1+"\\CLOUD-18\\WebContent\\EmployProjectReport\\"+filename;

				File outputfile = new File(
						realpath1+"\\CLOUD-18\\WebContent\\EmployProjectReport\\"+filename);
										
				System.out.println(" writing outputfile ="+outputfile);

				ImageIO.write(bimg, "png", outputfile);
				

				// System.out.println(" bimg is ="+bimg);

				System.out.println("Message Sucessfully Inserted inside Image");

				response.sendRedirect("EmployHidemsgsuccess.jsp?EmpID="+EmpID+"&&EmployName="+EmployName+"&&Fullpath="+FullpathImage+"&&filename="+filename+"&&ProjectAllocation="+ProjectAllocation+"&&ProjectDescription="+ProjectDescription+"&&Startdate="+Startdate+"&&Enddate="+Enddate);
	
				System.out.println("End of HidemsginImage Page");

			

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
