
document.getElementById("category").addEventListener("change",function()
{
	
	if(document.getElementById("category").value =="Executives")
		{
		alert("Your are Choosed "+document.getElementById("category").value+" Designation ");
		
		document.getElementById("WorkingDays").style.visibility='visible';
		document.getElementById("TotalDays").style.visibility='visible';
		
		document.getElementById("Advance").style.visibility='hidden';
		document.getElementById("PFNumber").style.visibility='hidden';
		document.getElementById("LWF").style.visibility='hidden';
		document.getElementById("Advance").style.visibility='hidden';
		document.getElementById("Conveyance").style.visibility='hidden';
		document.getElementById("MedicalAllowance").style.visibility='hidden';
		document.getElementById("OTHours").style.visibility='hidden';
		
		}
	if(document.getElementById("category").value =="Qc Lab")
	{
	alert("Your are Choosed "+document.getElementById("category").value+" Designation ");
	
	document.getElementById("WorkingDays").style.visibility='visible';
	document.getElementById("TotalDays").style.visibility='visible';
	
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("PFNumber").style.visibility='visible';
	document.getElementById("LWF").style.visibility='visible';
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("Conveyance").style.visibility='visible';
	document.getElementById("MedicalAllowance").style.visibility='visible';
	
	document.getElementById("OTHours").style.visibility='hidden';
	
	}
	if(document.getElementById("category").value =="Managers")
	{
	alert("Your are Choosed "+document.getElementById("category").value+" Designation ");
	
	document.getElementById("WorkingDays").style.visibility='visible';
	document.getElementById("TotalDays").style.visibility='visible';
	
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("PFNumber").style.visibility='visible';
	document.getElementById("LWF").style.visibility='visible';
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("Conveyance").style.visibility='visible';
	document.getElementById("MedicalAllowance").style.visibility='visible';
	
	document.getElementById("OTHours").style.visibility='hidden';
	
	}
	if(document.getElementById("category").value =="Permanent Workers")
	{
	alert("Your are Choosed "+document.getElementById("category").value+" Designation ");
	
	document.getElementById("WorkingDays").style.visibility='visible';
	document.getElementById("TotalDays").style.visibility='visible';
	
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("PFNumber").style.visibility='visible';
	document.getElementById("LWF").style.visibility='visible';
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("Conveyance").style.visibility='visible';
	document.getElementById("MedicalAllowance").style.visibility='visible';
	document.getElementById("OTHours").style.visibility='visible';
	
	}
	if(document.getElementById("category").value =="General Workers")
	{
	alert("Your are Choosed "+document.getElementById("category").value+" Designation ");
	
	document.getElementById("WorkingDays").style.visibility='visible';
	document.getElementById("TotalDays").style.visibility='visible';
	
	document.getElementById("Advance").style.visibility='hidden';
	document.getElementById("PFNumber").style.visibility='hidden';
	document.getElementById("LWF").style.visibility='hidden';
	document.getElementById("Advance").style.visibility='visible';
	document.getElementById("Conveyance").style.visibility='hidden';
	document.getElementById("MedicalAllowance").style.visibility='hidden';
	document.getElementById("OTHours").style.visibility='visible';
	
	
	}
	
	});


