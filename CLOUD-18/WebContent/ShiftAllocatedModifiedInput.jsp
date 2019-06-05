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
<title>Shift Allocation</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<link href="assets/css/font-awesome.min.css" rel="stylesheet" />
<link href="assets/css/style.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Ruluko'
	rel='stylesheet' type='text/css' />

</head>
<body >

 
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
					<li><a href="ShiftAllocatedDetails.jsp">Shift Allocated Details</a></li>
					<li><a href="ShiftAllocatedModified.jsp">Shift Allocation Update</a></li>
					<li><a href="Log-Out.jsp">LOG-OUT</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<br><br>
	<section class="for-full-back color-light " id="about">
		<div class="container">

			<div class="row text-center">
				<div class="col-md-8 col-md-offset-2">
					<h2>Employee Shift Update</h2>

				</div>

			</div>

			<%
            
                    Transaction transaction;
    		
                   @SuppressWarnings("deprecation")
                   
                   Session session1=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    		
            %>


			<center>
				
				<%!
				
                String EmpID;
				
				String EmployName;
				
				String SAP_EMPID;
			
				%>

				<!-- //Five table -->
				
				<br>
				<%
				
				   String EmpID =request.getParameter("EmpID");
				
			       System.out.println("ShiftAllocatedModifiedInput.jsp EmpID ="+EmpID);
				
                   
                   transaction=session1.beginTransaction(); 
				                             
                   Query query =session1.createQuery(" from ShiftAllocationPojo where EmployeeeID='"+EmpID+"'");
                   
    		       System.out.println("query ="+query);
    		
                   List list1=query.list();
                   
                   transaction.commit();
                     
                   Iterator itr1=list1.iterator();
                   
                                       
                   %>
                 
				 
				 <table border="1"
					style="position: relative; left: 10px; background-color: #A9A9A9">

					<tr>

						<th height="50px">Employee ID</th>
						<th>Employee Name</th>
						<th>Shift Name</th>
						<th>UPDATE</th>

					</tr>
                  
					<%
						while (itr1.hasNext()) {
							
							ShiftAllocationPojo URP = (ShiftAllocationPojo) itr1.next();

							EmpID = URP.getEmpID();

							EmployName = URP.getEmployName();

							
					%>
					
					<tr>
					<form action="ShiftAllocatedModifiedInput?EmployName=<%=EmployName%>&&EmpID=<%=EmpID%>" method="post" >
						
						<td height="50"width="100px"><%=EmpID%></td>
						<td width="100px"><%=EmployName%></td>
                        
						<td width="100px">
						<script type="text/javascript" src="js/Shift1.js"></script>
						<select name="ShiftName" id="ShiftName" >
						<option value="Morning-Shift">Morning-Shift</option>
						<option value="Aftnoon-Shift">Aftnoon-Shift</option>
						<option value="Night-Shift">Night-Shift</option>
						</select>
						</td>
						
                        
                        <td width="100px"><input type="submit" value="SEND"></td>
                        
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
	<script type="text/javascript" src="js/Shift1.js"></script>
	

</body>
</html>
