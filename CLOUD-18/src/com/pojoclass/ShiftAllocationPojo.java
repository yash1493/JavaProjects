package com.pojoclass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ShiftAllocation")
public class ShiftAllocationPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int ID;
	
	@Column(name="EmployeeeID",unique=true)
	private String EmpID;
	
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
	
	public String getShiftName() {
		return ShiftName;
	}
	public void setShiftName(String shiftName) {
		ShiftName = shiftName;
	}
	
	private String EmployName;
	
	private String ShiftName;
	
}
