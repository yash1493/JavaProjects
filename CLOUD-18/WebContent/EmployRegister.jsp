<!DOCTYPE html>
<%@page import="java.util.*" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Employee Register</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/font-awesome.min.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
     <link href='http://fonts.googleapis.com/css?family=Ruluko' rel='stylesheet' type='text/css' />
    
    
<script type="text/javascript">

function Validation()
{
	var EmployeeName =document.getElementById("EmployeeName").value; 
	var category =document.getElementById("category").value;
	var Password =document.getElementById("Password").value;
	var ConfPassword =document.getElementById("ConfPassword").value;
	var MobileNumber =document.getElementById("MobileNumber").value;
	
	
	if(EmployeeName == null || EmployeeName =="")
	{
	alert("EmployeeName is Required");
	return false;
	} 
	else if(category == null || category =="")
	{
	alert("Please choose your Designation");
	return false;
	}
	else if(Password == null || Password =="")
	{ 
	alert("Password is Required");
	return false;
	}
	else if(Password.length <8)
	{
	alert("Your Password Strength is week. Plz Enter Alteast 8 Character");
	return false;
	}
	else if(ConfPassword == null || ConfPassword =="")
	{
	alert("Conform Password is Required");
	return false;
	}
	else if(Password != ConfPassword)
	{
	alert("Password & Conform Password is must be Same");
	return false;
	} 
	
	
}


</script>    
</head>
<body>
    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="">WELCOME</a>
            </div>
            <!-- Collect the nav links for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.jsp">HOME</a>
                    </li>
                    
                   
                    <li><a href="EmployLogin.jsp">EMPLOYEE LOGIN</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!--End Navigation -->

<br></br>

    <section class="for-full-back color-white" id="services">
        <div class="container">

            <div class="row text-center">
                <div class="col-md-8 col-md-offset-2">
                    <h2 >Enter Your Personal Details</h2>
                    <h2>
                        <!-- <strong>
                        Add Personal Details :
                        </strong> -->
                    </h2>
                </div>

            </div>
            
             <%
            
             Random r =new Random();
     		
     		int d1 =r.nextInt(9);
     		int d2 =r.nextInt(9);
     		
     		String randomNo="CC10"+d1+d2;
     		
     		String EmpID=randomNo;
     		
     		System.out.println("randomNo ="+randomNo);
            
            System.out.println("EmpID ="+EmpID);
            
            %> 
            
             <h3>  <center>

                     <form action="EmployRegister" method="post">
                 
                 <table style="">
                 
                 <tr><td> Employ ID *:<br></br></td><td> <input type="text" name="EmployeeID" value="<%=EmpID %>" placeholder=" Ex : srinath" required="required"><br></br></td></tr>
                 
                    <tr><td> Employee Name *:<br></br></td><td> <input type="text" id="EmployeeName" name="EmployeeName" required="required"><br></br></td></tr>
                   
                     <tr><td>Designation * :<br></br></td><td><select id="category" name="category" >
                     <option value="">Choose-Option</option>
                     <option value="IT Developing">Developer</option>
                     <option value="QC Testing">Tester</option>
                     <option value="BPO">System Engineer</option>
                     <option value="System Management">Management</option>
                     
                    
                     
                     </select><br></br></td></tr>
                   
                    <tr> <td>Password :<br></br></td><td><input type="password" name="Password" id="Password" required="required"></td></tr>
                    <tr> <td>Confirm Password :<br></br></td><td><input type="password" name="ConfPassword" id="ConfPassword" required="required"></td></tr>
                    <tr> <td>Salary * :<br></br></td><td><input type="number" name="Salary" id="Salary" required="required"></td></tr>
                    <tr> <td>Date-Of-Birth :<br></br></td><td><input type="date" name="DateOfBirth" id="DateOfBirth" required="required" ></td></tr>
                    <tr> <td>Mobile Number * :<br></br></td><td><input type="number" name="MobileNumber" id="MobileNumber" required="required"></td></tr>
                    <tr> <td>Address * :<br></br></td><td><input type="text" name="Address" id="Address" required="required" ></td></tr>
                    
                    </table><br>
                   <input type="submit" value="Submit" onclick="return Validation()">
                   
                    </form></center></h3>
              
    </section>  

    <br></br>
    <br></br>
    <br></br>
    <br></br>
   <div class="for-full-back " id="footer">
        Designed by Yash
         
    </div>
    <script src="assets/plugins/jquery-1.10.2.js"></script>
    <script src="assets/plugins/bootstrap.js"></script>
    <script src="assets/js/custom.js"></script>
    <script type="text/javascript" src="js/Attributes.js"></script>

</body>
</html>
