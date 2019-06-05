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
<title>ViewProjectAllocation</title>
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
<br>
			<div class="row text-center">
				<div class="col-md-8 col-md-offset-2">
				<br><br>
					<h2>PROJECT ALLOCATION</h2>

				</div>

			</div>
			
			<%!String SecretKey; %>
			
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


          <%  transaction =session1.beginTransaction();
           
               Query query7=session1.createQuery("from UserRegisterPojo WHERE EmpID= '"+EmpID1+"'"); 
           
               List list7 =query7.list();
               
               transaction.commit();
               
               Iterator it7 =list7.iterator();
               
               while(it7.hasNext())
               {
            	   UserRegisterPojo ur =(UserRegisterPojo)it7.next();
            	   
            	   SecretKey =ur.getSecretKey();
            	   
            	   System.out.println("SecretKey ="+SecretKey);
               }
               
               HttpSession session7 =request.getSession();
               
               session7.setAttribute("SecretKey", SecretKey);
               
           %>   

			<center>
				

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
					style="position: relative; left: 10px; background-color: #A9A9A9">
                 
					<tr>
                        
						<th>Employee ID</th>
						<th>Employee Name</th>
						<th>Project Allocation</th>
						
						<th>Start Date</th>
						<th>End Date</th>
						

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
						<td height="50"width="100px"><%=EmpID%></td>
						<td width="100px"><%=EmployName%></td>
                        <td width="100px"><a href="Receivergettingsecretmsg?ProjectDescription=<%=ProjectDescription%>"><img src="SecureCloud//<%=ProjectAllocation%>" width="200px" height="200px"></a></td>
						
						<td width="100px"><%=Startdate%></td>
						<td width="100px"><%=Enddate%></td>
						

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
