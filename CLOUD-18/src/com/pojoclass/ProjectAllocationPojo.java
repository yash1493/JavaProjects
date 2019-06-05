package com.pojoclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projectallocation")
public class ProjectAllocationPojo 
{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="Id")
	  private int Id;
	
	public void setId(int id)
	{
		this.Id=id;
	}
	public int getId()
	{
		return Id;
	}
	private String EmpID,EmployName,ProjectAllocation,ProjectDescription,Startdate,Enddate;

	public String getEmpID() {
		return EmpID;
	}

	public void setEmpID(String empID) {
		EmpID = empID;
	}

	public String getEmployName() {
		return EmployName;
	}

	public void setEmployName(String employName) {
		EmployName = employName;
	}

	public String getProjectAllocation() {
		return ProjectAllocation;
	}

	public void setProjectAllocation(String projectAllocation) {
		ProjectAllocation = projectAllocation;
	}

	public String getProjectDescription() {
		return ProjectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		ProjectDescription = projectDescription;
	}

	public String getStartdate() {
		return Startdate;
	}

	public void setStartdate(String startdate) {
		Startdate = startdate;
	}

	public String getEnddate() {
		return Enddate;
	}

	public void setEnddate(String enddate) {
		Enddate = enddate;
	}

}
