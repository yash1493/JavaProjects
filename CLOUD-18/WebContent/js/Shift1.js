//alert("incoming");
document.getElementById("ShiftName").addEventListener("change",function()
		{
	
	  //  alert("value of shiftname"+document.getElementById("ShiftName").value);
	    
	    if(document.getElementById("ShiftName").value =="Morning-Shift")
	    	{
	    	document.getElementById("ShiftTiming").value ="6-AM-to-2-PM";
	    	}
	    else  if(document.getElementById("ShiftName").value =="Aftnoon-Shift")
	    	{
	    	document.getElementById("ShiftTiming").value ="2-PM-to-10-PM";
	    	}
	    else  if(document.getElementById("ShiftName").value =="Night-Shift")
    	{
    	document.getElementById("ShiftTiming").value ="10-PM-to-6-AM";
    	}
	    
	
		});

