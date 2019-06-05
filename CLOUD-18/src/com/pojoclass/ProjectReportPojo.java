package com.pojoclass;

import javax.persistence.GenerationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProjectReport")
public class ProjectReportPojo {
	
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int Id;
   
    
    private String EmployeeID;
    
    public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
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

	public String getChooseReport() {
		return ChooseReport;
	}

	public void setChooseReport(String chooseReport) {
		ChooseReport = chooseReport;
	}

	public String getFinishedDate() {
		return FinishedDate;
	}

	public void setFinishedDate(String finishedDate) {
		FinishedDate = finishedDate;
	}

	private String EmployeeName;
    
    private String ProjectAllocation;
    
    private String ProjectDescription;
    
    private String StartDate;
    
    private String EndDate;
    
    private String ChooseReport;
    
    private String FinishedDate;
    
    private String Filename;

	public String getFilename() {
		return Filename;
	}

	public void setFilename(String filename) {
		Filename = filename;
	}

}
