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

<title>Employ_ProjectReport</title>
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
				<a class="navbar-brand" href="htttp://www.binarytheme.com">EMPLOYEE</a>
			</div>
			<!-- Collect the nav links for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="EmployWelcomePage.jsp">HOME</a></li>
					
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
                    <h2>PROJECT REPORT</h2>
                    
                </div>

            </div>
			
			<%
			
			HttpSession Hsession=request.getSession();
			
			String EmpID1 =(String)Hsession.getAttribute("EmpID");
			
			System.out.println("ViewProjectAllocation.jsp EmpID1 ="+EmpID1);
			
			
			
			
			%>

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
                                                      
                   Query query =session1.createQuery(" from ProjectAllocationPojo E WHERE E.EmpID = '"+EmpID1+"'");
                   
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
						<th>Project Allocation</th>
						<th>Start Date</th>
						<th>End Date</th>
						<th>Choose Report</th>
						
						<th>SEND</th>

					</tr>

					<%
						while (itr1.hasNext()) {

							ProjectAllocationPojo URP = (ProjectAllocationPojo) itr1.next();

							String EmpID = URP.getEmpID();

							String EmployName = URP.getEmployName();

							String ProjectAllocation = URP.getProjectAllocation();

							String ProjectDescription = URP.getProjectDescription();

							String Startdate = URP.getStartdate();
							
							String Enddate = URP.getEnddate();
					%>
					<tr>
					<form action="Employ_ProjectWork?EmpID=<%=EmpID%>&&EmployName=<%=EmployName%>&&ProjectAllocation=<%=ProjectAllocation%>&&ProjectDescription=<%=ProjectDescription%>&&Startdate=<%=Startdate%>&&Enddate=<%=Enddate%>" method="post" enctype="multipart/form-data">
						
						<td height="50"width="100px"><%=EmpID%></td>
						<td width="100px"><%=EmployName%></td>
                        <td width="100px"><%=ProjectAllocation%></td>
						<td width="100px"><%=Startdate%></td>
						<td width="100px"><%=Enddate%></td>
						<td width="100px"><input type="file" name="File" required="required"></td>
						
						<td width="100px"><input type="submit" Value="SEND REPORT"></td>
						
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
