package com.pojoclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;


@Entity
@Table(name="PerformenceStatus")
public class PerformencePojo {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int Id; 
	
	private String EmpId;
	
	private String EmployeeName;
	
	private String ProjectAllocation;
	
	private String ProjectDescription;
	
	private String StartDate;
	
	private String EndDate;
	
	private String ProjectReport;
	
	private String finishingDate;
	
	public String getFinishingDate() {
		return finishingDate;
	}

	public void setFinishingDate(String finishingDate) {
		this.finishingDate = finishingDate;
	}

	private String PerformenceStatus;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
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

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getProjectReport() {
		return ProjectReport;
	}

	public void setProjectReport(String projectReport) {
		ProjectReport = projectReport;
	}

	public String getPerformenceStatus() {
		return PerformenceStatus;
	}

	public void setPerformenceStatus(String performenceStatus) {
		PerformenceStatus = performenceStatus;
	}
	
}
