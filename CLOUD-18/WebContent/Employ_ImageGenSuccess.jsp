<!DOCTYPE html>
<%@page import="com.pojoclass.*"%>
<%@ page import="org.hibernate.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@ page import="org.hibernate.cfg.AnnotationConfiguration"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Employee_ImageGenSuccess</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<link href="assets/css/font-awesome.min.css" rel="stylesheet" />
<link href="assets/css/style.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Ruluko'
	rel='stylesheet' type='text/css' />

</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="htttp://www.binarytheme.com">WELCOME</a>
			</div>
			<!-- Collect the nav links for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav navbar-right">
				 <li><a href="ManagerWelcomePage.jsp">HOME</a></li>
					<li><a href="ViewProjectAllocation.jsp">PROJECT ALLOCATED DETAILS</a></li>
					
					<li><a href="Log-Out.jsp">LOG-OUT</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	
	<section class="for-full-back color-light " id="about">
		<div class="container">

			<div class="row text-center">
				<div class="col-md-8 col-md-offset-2">
					<h2>PROJECT WORK</h2>

				</div>

			</div>

            <br>

			<%
			
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
			
			System.out.println("EmployName ="+EmployName);
			
			String Fullpath =request.getParameter("path");
				
		    System.out.println("Fullpath ="+Fullpath);
			
		    String filename =request.getParameter("filename");
			
		    System.out.println("filename ="+filename);
			
			%>
			
		<center><a href="HidemsginImageEmploy?EmpID=<%=EmpID%>&&EmployName=<%=EmployName%>&&Fullpath=<%=Fullpath%>&&filename=<%=filename%>&&ProjectAllocation=<%=ProjectAllocation%>&&ProjectDescription=<%=ProjectDescription%>&&Startdate=<%=Startdate %>&&Enddate=<%=Enddate%>"><img src="EmployProjectWork//<%=filename %>" width="500px" height="500px"></a>  </center>
				
		</div>

	</section>
	
	<script src="assets/plugins/jquery-1.10.2.js"></script>
	<script src="assets/plugins/bootstrap.js"></script>
	<script src="assets/js/custom.js"></script>

</body>
</html>
