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
<title>PerformenceStatusView</title>
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
					<li><a href="Performance.jsp">PERFORMANCE UPDATE</a></li>
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
					<h2>Employee Performance </h2>

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
				
				ArrayList AL =new ArrayList();
				
				int f;
				
				%>

				<!-- //Five table -->
				
				<br>
				<%
				 
                   transaction=session1.beginTransaction(); 
				                                  
                   Query query =session1.createQuery(" from PerformencePojo ");
                   
    		       System.out.println("query ="+query);
    		
                   List list1=query.list();
                    
                   transaction.commit();
                     
                   Iterator itr1=list1.iterator();
                   
                                       
                   %>
                 
				 
				 <table border="1"
					style="position: relative; left: 10px; background-color: #A9A9A9">

					<tr>

						<th height="50px" width="100px">Employee ID</th>
						<th width="110px">Employee Name</th>
						<th width="110px">ProjectAllocation</th>
						<th width="110px">StartDate</th>
						<th width="110px">EndDate</th>
						<th width="110px">ProjectReport</th>
						<th width="110px">FinishedDate</th>
						<th width="110px">Performance-Status</th>
						
						
					</tr>
                  
					<%
						while (itr1.hasNext()) {
							
							

							PerformencePojo PRP = (PerformencePojo) itr1.next();

							EmpID = PRP.getEmpId();
							
							EmployName = PRP.getEmployeeName();

							String ProjectAllocation = PRP.getProjectAllocation();

							String ProjectDescription = PRP.getProjectDescription();

							String StartDate = PRP.getStartDate();
							
							String EndDate = PRP.getEndDate();
							
							String ProjectReport = PRP.getProjectReport();
							
							String FinishingDate = PRP.getFinishingDate();
							
							String PerformenceStatus = PRP.getPerformenceStatus();
							
							
					%>
					
					<tr>
<form action="PerformenceStatus?EmpID=<%=EmpID%>&&EmployName=<%=EmployName%>&&ProjectAllocation=<%=ProjectAllocation%>&&ProjectDescription=<%=ProjectDescription%>&&Startdate=<%=StartDate%>&&Enddate=<%=EndDate%>&&ProjectReport=<%=ProjectReport%>&&FinishingDate=<%=FinishingDate%>" method="post">					
					
					<td height="50"width="100px"><span style="color: blue;"><%=EmpID%></span></td>
						<td width="100px"><span style="color: blue;"><%=EmployName%></span></td>
                        <td width="100px"><span style="color: blue;"><%=ProjectAllocation %></span></td>
						<td width="100px"><span style="color: blue;"><%=StartDate %></span></td>
						<td width="100px"><span style="color: blue;"><%=EndDate %></span></td>
						<td width="100px"><a href="ProjectReportDownload?Filename=<%=ProjectReport%>"><span style="color: red;"><%=ProjectReport %></span></a></td>
						<td width="100px"><span style="color: blue;"><%=FinishingDate %></span></td>
						<td width="100px"><span style="background-color: black; color: aqua; "><%=PerformenceStatus%></span></td>
                       
					
					</form>
					</tr>
                   
					<%
								
                   }
                     %>
                     
				</table> 
               
	</section>

	<script src="assets/plugins/jquery-1.10.2.js"></script>
	<script src="assets/plugins/bootstrap.js"></script>
	<script src="assets/js/custom.js"></script>
	<script type="text/javascript" src="js/Shift1.js"></script>
	

</body>
</html>
