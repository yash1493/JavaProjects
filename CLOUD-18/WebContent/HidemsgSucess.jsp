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
<title>HidemsgSuccess</title>
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
					<li><a href="ProjectAllocated_ALL.jsp">PROJECT ALLOCATED DETAILS</a></li>
					
					<li><a href="Log-Out.jsp">LOG-OUT</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	
	<section class="for-full-back color-light " id="about">
		<div class="container">
<br>
			<div class="row text-center">
				<div class="col-md-8 col-md-offset-2">
					<h2>PROJECT ALLOCATION</h2>

				</div>

			</div>
			
			<%
			
			String EmpID =request.getParameter("EmpID");
			
			System.out.println("EmpID ="+EmpID);
			
			String EmployName =request.getParameter("EmployName");
			
			System.out.println("EmployName ="+EmployName);
			
			String Fullpath =request.getParameter("Fullpath");
				
		    System.out.println("Fullpath ="+Fullpath);
			
		    String filename =request.getParameter("filename");
			
		    System.out.println("filename ="+filename);
			
			
			
			%>

<br><br>
			
		<center>	<h2><span style="color: brown;">Your Secret Project Details is Successfully Hiding in Image</span></h2>  </center>
			
			<br>
			
			<form action="ProjectAllocation?EmployName=<%=EmployName%>&&EmpID=<%=EmpID%>&&Fullpath=<%=Fullpath%>&&filename=<%=filename%>" method="post">
			
			<img src="SecureCloud//<%=filename%>" width="250px" height="250px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
			<input type="date" name="Startdate">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
			<input type="date" name="Enddate">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
			<input type="submit" value="upload">
				
			</form>	
				
				
	<script src="assets/plugins/jquery-1.10.2.js"></script>
	<script src="assets/plugins/bootstrap.js"></script>
	<script src="assets/js/custom.js"></script>

</body>
</html>
