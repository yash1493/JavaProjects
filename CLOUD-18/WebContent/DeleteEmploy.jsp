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
<title>DeleteEmploy</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<link href="assets/css/font-awesome.min.css" rel="stylesheet" />
<link href="assets/css/style.css" rel="stylesheet" />

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
				<a class="navbar-brand" href="">MANAGER</a>
			</div>
			<!-- Collect the nav links for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="ManagerWelcomePage.jsp">HOME</a></li>
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
				<br><br><br>
					<h2>DELETE EMPLOYEE </h2>

				</div>

			</div>

			<%
            
                    Transaction transaction;
    		
                   @SuppressWarnings("deprecation")
                   
                   Session session1=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    		
            %>


			<center>
				

				<!-- //Five table -->
				
				<br>
				<%
                   
                   transaction=session1.beginTransaction(); 
                                                      
                   Query query =session1.createQuery(" from UserRegisterPojo");
                   
    		       System.out.println("query ="+query);
    		
                   List list1=query.list();
                   
                   //System.out.println("l ="+list1.get(1));
                   
                   transaction.commit();
                     
                   Iterator itr1=list1.iterator();
                   
                                       
                   %>

				 <table border="1"
					style="position: relative; left: 10px; background-color: 	#A9A9A9">

					<tr>

						<th>Employee ID</th>
						<th>Employee Name</th>
						<th>Salary</th>
						<th>Date-Of-Birth</th>
						<th>Mobile Number</th>
						<th>Address</th>
						<th>Delete</th>
						

					</tr>

					<%
						while (itr1.hasNext()) {

							UserRegisterPojo URP = (UserRegisterPojo) itr1.next();

							String EmpID = URP.getEmpId();

							String EmployName = URP.getEmployName();

							String Salary = URP.getSalary();

							String DateOfBirth = URP.getDateOfBirth();

							String MobileNumber = URP.getMobileNumber();
							
							String Address = URP.getAddress();
					%>
					<tr>
					<form action="DeleteEmployee?EmployName=<%=EmployName%>&&EmpID=<%=EmpID%>" method="post" >
					
						<td height="50"width="100px"><%=EmpID%></td>
						<td width="100px"><%=EmployName%></td>
                        <td width="100px"><%=Salary%></td>
						<td width="100px"><%=DateOfBirth%></td>
						<td width="100px"><%=MobileNumber%></td>
						<td width="100px"><%=Address%></td>
						<td width="100px"><input type="submit" value="DELETE"></td>
					</form>
					</tr>

					<%
                   }
                     %>
				</table> 

				
		</div>


	</section>

	<script src="assets/plugins/jquery-1.10.2.js"></script>
	<script src="assets/plugins/bootstrap.js"></script>
	<script src="assets/js/custom.js"></script>

</body>
</html>
