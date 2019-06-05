<!DOCTYPE html>
<%@page import="com.pojoclass.*"%>

<%@ page import="org.hibernate.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@ page import="org.hibernate.cfg.AnnotationConfiguration"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>EmployeeWelcomePage</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/font-awesome.min.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Ruluko' rel='stylesheet' type='text/css' />
    
   <style type="text/css">
   {
 #cen
 {
 position:relative;
 top:10px;
  }
   </style> 
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
				<a class="navbar-brand" href="">EMPLOYEE</a>
			</div>
            <!-- Collect the nav links for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#home">HOME</a>
                    </li>
                                       
                    <li><a href="Log-Out.jsp">LOG-OUT</a>
                    </li>
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
            <%
                   
                   transaction=session1.beginTransaction(); 
                                                      
                   Query query =session1.createQuery(" from UserRegisterPojo WHERE EmpID= '"+EmpID1+"'");
                   
    		       System.out.println("query ="+query);
    		
                   List list1=query.list();
                   
                   //System.out.println("l ="+list1.get(1));
                   
                   transaction.commit();
                     
                   Iterator itr1=list1.iterator();
                   
                                       
                   %>
                   <%
						

							UserRegisterPojo URP = (UserRegisterPojo) itr1.next();

							String EmpID = URP.getEmpId();

							String EmployName = URP.getEmployName();

							String MobileNumber = URP.getMobileNumber();
							
					
                    //EmpID =request.getParameter("EmpID");
            		System.out.println("EmpID:"+EmpID);
                    //EmployName =request.getParameter("EmployName");
                    System.out.println("EmployName:"+EmployName);
            		//MobileNumber=request.getParameter("MobileNumber");
            		System.out.println("Mob:"+MobileNumber);
                    %>
                    <li><a href="ForgotKey?EmpID=<%=EmpID%>&&EmployName=<%=EmployName%>&&MobileNumber=<%=MobileNumber%>" style="color:red;">Forgot Key ?</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <br><br><br><br><br><br><br><br><br>
<div class="" id="home">
    <br>
      
        <div class="row text-center " id="cen">
       
             <div >             
                           
                         <h3>  <a href="ViewProjectAllocation.jsp">VIEW ALLOCATED PROJECT</a></h3>
   
                 </div>
            <div >
    
                         
                         <h3>  <a href="Employ_ProjectReport.jsp">SEND REPORT TO MANAGER</a></h3>
       
                 </div>
                 
                
             <div >

                         <h3>  <a href="Employ_performanceStatus.jsp">CHECK PERFORMANCE STATUS</a></h3>
          
                 </div>
                 
                 <div >
                   
                      <h3>  <a href="Employ_ShiftAllocated.jsp">SHIFT ALLOCATED</a></h3>
      
                 </div>
             
          </div>
    </div>
   
    <br><br>
   <div class="for-full-back " id="footer">
        Designed by Yash
         
    </div>
    <script src="assets/plugins/jquery-1.10.2.js"></script>
    <script src="assets/plugins/bootstrap.js"></script>
    <script src="assets/js/custom.js"></script>

</body>
</html>
