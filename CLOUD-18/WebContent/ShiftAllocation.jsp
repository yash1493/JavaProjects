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
					<li><a href="ShiftAllocatedDetails.jsp">SHIFT ALLOCATED DETAILS</a></li>
					<li><a href="ShiftAllocatedModified.jsp">SHIFT ALLOCATION UPDATE</a></li>
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
					<h2>SHIFT ALLOCATION</h2>

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
				
				   Query query2 =session1.createQuery(" from ShiftAllocationPojo");
				   
				   List list2 =query2.list();
				   
				   Iterator itr2 =list2.iterator();
				   
				   while(itr2.hasNext())
				   {
					   
					   
					   ShiftAllocationPojo sap =(ShiftAllocationPojo)itr2.next();
					   
					   SAP_EMPID =sap.getEmpID();
					   
					   System.out.println("SAP_EMPID ="+SAP_EMPID);
					   
					   AL.add(SAP_EMPID);
					   
					   System.out.println("AL ="+AL);
				   }
				   
				   
                                                      
                   Query query =session1.createQuery(" from UserRegisterPojo ");
                   
    		       System.out.println("query ="+query);
    		
                   List list1=query.list();
                   
                  // System.out.println("l ="+list1.get(1));
                   
                   transaction.commit();
                     
                   Iterator itr1=list1.iterator();
                   
                                       
                   %>
                 
				 
				 <table border="1"
					style="position: relative; left: 10px; background-color: #A9A9A9">

					<tr>

						<th height="50px" width="100px">Employee ID</th>
						<th width="100px">Employee Name</th>
						<!--  <th width="100px">Shift Duration</th>-->
						<th width="100px">Shift Name</th>
						<!-- <th width="100px">Shift Timing</th>-->
						
						<th width="100px">Send</th>

					</tr>
                  
					<%
						while (itr1.hasNext()) {
							
							f =0;

							UserRegisterPojo URP = (UserRegisterPojo) itr1.next();

							EmpID = URP.getEmpId();
							
							System.out.println("User Register table EmpID ="+EmpID);

							EmployName = URP.getEmployName();

							String Salary = URP.getSalary();

							String DateOfBirth = URP.getDateOfBirth();

							String MobileNumber = URP.getMobileNumber();
							
							String Address = URP.getAddress();
							
							System.out.println("AL Size ="+AL.size());
							
							for(int i=0; i<AL.size(); i++)
							{
								System.out.println("AL value inside for loop ="+AL.get(i));
										
								boolean Checking =EmpID.equals(AL.get(i).toString());		
								
								if(EmpID.equals(AL.get(i).toString()))
								{
									 f =1;
									break;
								}
							}
							
							if(f == 0)
							{	
					%>
					
					<tr>
					<form action="ShiftAllocation?EmployName=<%=EmployName%>&&EmpID=<%=EmpID%>" method="post" >
						
						<td height="50"width="100px"><%=EmpID%></td>
						<td width="100px"><%=EmployName%></td>
                        <!--  <td width="100px">
						<input type="month" name ="ShiftDuration" required="required">
						</td>-->
						<td width="100px">
						<script type="text/javascript" src="js/Shift1.js"></script>
						<select name="ShiftName" id="ShiftName" >
						<option value="Morning-Shift">Morning-Shift</option>
						<option value="Aftnoon-Shift">Aftnoon-Shift</option>
						<option value="Night-Shift">Night-Shift</option>
						</select>
						</td>
						<!-- <td width="100px">
						<script type="text/javascript" src="js/Shift1.js"></script>
						<select name="ShiftTiming" id="ShiftTiming" >
						<option value="6-AM-to-2-PM">6-AM-to-2-PM</option>
						<option value="2-PM-to-10-PM">2-PM-to-10-PM</option>
						<option value="10-PM-to-6-AM">10-PM-to-6-AM</option>
						</select>
						
						</td>-->
                        
                        <td width="100px"><input type="submit" value="SEND"></td>
                        
                   </form>
					</tr>
                   
					<%
							}		
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
