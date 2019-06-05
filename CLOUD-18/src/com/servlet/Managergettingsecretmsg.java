package com.servlet;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Receivergettingsecretmsg
 */
@WebServlet("/Managergettingsecretmsg")
public class Managergettingsecretmsg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String SecretKey;
	String ImageFullpath;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Managergettingsecretmsg() {
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

		try {
		
		System.out.println("welcome manager getting secret msg");

		String Filename =request.getParameter("Filename");
		
		System.out.println("Filename ="+Filename);

		SecretKey = "12345";

		System.out.println("SecretKey =" + SecretKey);
		
		String realpath =getServletContext().getRealPath("");
		
		String fullpath =realpath.substring(0, realpath.indexOf("."))+"\\CLOUD-18\\WebContent\\EmployProjectReport\\";

		ImageFullpath = fullpath+Filename;

		System.out.println("ImageFullpath =" + ImageFullpath);

		String Check_SecretKey = JOptionPane
				.showInputDialog("Enter Your Secret Key");

		System.out.println("Check_SecretKey =" + Check_SecretKey);

		if (SecretKey.equals(Check_SecretKey))
		{
			System.out.println("Condition Matched");

			Managergettingsecretmsg msg = new Managergettingsecretmsg();

			File file1 = new File(ImageFullpath); // Secret msg Image path

			System.out.println("file1 =" + file1);

			FileInputStream fis1 = new FileInputStream(file1);

			System.out.println("fis1 =" + fis1);

			BufferedImage bimg1 = ImageIO.read(fis1); // reading the image file

			System.out.println("bimg1 =" + bimg1);

			
				msg.decodestegnography(bimg1);
			

			response.sendRedirect("Manager_ProjectReportView.jsp");
			
		} else {
			System.out.println("Condition Failed");

			Component par = null;

			JOptionPane.showMessageDialog(par,
					"Sorry your Secret Key is Incorrect");

			String Check1_SecretKey = JOptionPane
					.showInputDialog("Re-Enter Your Secret Key");

			System.out.println("Check1_SecretKey =" + Check1_SecretKey);

			if (SecretKey.equals(Check1_SecretKey)) 
			{
				System.out.println("Condition Matched but Check1");
				
				Managergettingsecretmsg msg7 = new Managergettingsecretmsg();
				
				File file7 = new File(ImageFullpath); // Secret msg Image path

				System.out.println("file7 =" + file7);

				FileInputStream fis7 = new FileInputStream(file7);

				System.out.println("fis7 =" + fis7);

				BufferedImage bimg7 = ImageIO.read(fis7); // reading the image file

				System.out.println("bimg7 =" + bimg7);

				
					msg7.decodestegnography(bimg7);
				

				response.sendRedirect("Manager_ProjectReportView.jsp");
				
			} else 
			{
				System.out.println("Condition again failed");

				JOptionPane
						.showMessageDialog(par,
								"Again your Secret key is Incorrect. Plz Try again Later");

				System.out.println("failed page going");

				response.sendRedirect("ManagerWelcomePage.jsp");
			}
		}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			response.sendRedirect("ManagerWelcomePage.jsp");
		}
		
	}

	

	private void decodestegnography(BufferedImage bimg) throws Exception {

		String msg1 = "";
		String DecryptMsg = "";

			System.out.println("in decode");
			char msg = 0;

			int w = bimg.getWidth(), h = bimg.getHeight();
			bitpattern(bimg.getRGB(0, 0));
			int msglength = (bimg.getRGB(0, 0) & 0xff);
			bitpattern(msglength);
			System.out.println("Message Length=" + msglength);

			// jTextField1.setText("");
			for (int row = 0, j = 0, i = 1; row < h; row++) {
				for (int col = 0; col < w && j < msglength; col++, i++) {

					if (i % 11 == 0) {
						int result = bimg.getRGB(col, row);

						int charatpos = (((result >> 16) & 0x7) << 5);

						charatpos |= (((result >> 8) & 0x7) << 2);

						charatpos |= ((result & 0x3));

						System.out.print((char) charatpos);

						// System.out.print("");

						msg = (char) charatpos;

						msg1 = msg1 + msg;

						// jTextField1.setText(jTextField1.getText()+
						// (char)charatpos);

						/*
						 * Component par = null;
						 * 
						 * JOptionPane.showMessageDialog(par,(char)charatpos );
						 */

						j++;

					}

				}
			}
			System.out.println("");
			System.out.println("msg1 =" + msg1);
			System.out.println("msg =" + msg);
			System.out.println("decoding done");

			Component rmsg = null;

			JOptionPane.showMessageDialog(rmsg, "" + msg1);

			DecryptMsg = encryptdata.decrypt(msg1);

			JOptionPane.showMessageDialog(rmsg, "" + DecryptMsg);

		
	}// function

	private void bitpattern(int rgb) {
		// TODO Auto-generated method stub

	}

}
