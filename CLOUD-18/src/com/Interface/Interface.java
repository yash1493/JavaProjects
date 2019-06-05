package com.Interface;

import java.util.List;

import com.pojoclass.*;

public interface Interface {
	
	public int register(UserRegisterPojo ur);
	
	public int UpdateKey(UserRegisterPojo ur);
	
	public List login(UserRegisterPojo ur);
	
	public int projectAllocation(ProjectAllocationPojo pap);
	
	public int shiftAllocation(ShiftAllocationPojo sa);
	
	public int shiftUpdate(ShiftAllocationPojo sa);
	
	public int ProjectReport(ProjectReportPojo prp);
	
	public int Performence(PerformencePojo p);
	
	public List getUsername(UserRegisterPojo ur);

	public int DeleteEmp(UserRegisterPojo ur);
}
