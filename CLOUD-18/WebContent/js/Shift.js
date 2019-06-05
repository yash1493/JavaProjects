


function shift()
{
	var shift =[{id:"1",name:"Morning-Shift",timing:"6-AM-to-2-PM"},{id:"2",name:"Aftnoon-Shift",timing:"2-PM-to-10-PM"},{id:"3",name:"Night-Shift",timing:"10-PM-to-6-AM"}];
	debugger;
alert(shift.length);
for(var i=0; i<shift.length;i++)
{
var option =document.createElement("OPTION");
debugger;
option.setAttribute('value', shift[i].id);
option.appendChild(document.createTextNode(shift[i].name));
document.getElementById("ShiftName").appendChild(option);

}

}

for(var i=0; i<shift.length;i++){
	

	var option =document.createElement("OPTION");
	debugger;
	option.setAttribute('value', shift[i].id);
	option.appendChild(document.createTextNode(shift[i].timing));
	document.getElementById("ShiftTiming").appendChild(option);

	}

document.getElementById("ShiftName").addEventListener("change",function()
		{
	
	    alert("value of shiftname"+document.getElementById("ShiftName").value);
	    
	    document.getElementById("ShiftTiming").value =document.getElementById("ShiftName").value
	    
	
		});