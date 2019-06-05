package com.pojoclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userregister")
public class UserRegisterPojo {
  
  @Id @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="Id")
  private int Id;
  
  @Column(name="EmpId",unique=true)
  private String EmpId;
 
  @Column(name="EmployName")
  private String EmployName;
 
  @Column(name="Password")
  private String Password;
 
  @Column(name="ConfPassword")
  private String ConfPassword;
 
  @Column(name="Salary")
  private String Salary;
 
  @Column(name="DateOfBirth")
  private String DateOfBirth;
  
  @Column(name="MobileNumber")
  private String MobileNumber;
 
  @Column(name="Address")
  private String Address;
  
  @Column(name="SecretKey")
  private String SecretKey;
  
  public String getSecretKey() {
	return SecretKey;
}

public void setSecretKey(String secretKey) {
	SecretKey = secretKey;
}

public String getEmpId() {
	return EmpId;
}

public void setEmpId(String empId) {
	EmpId = empId;
}

public String getEmployName() {
	return EmployName;
}

public void setEmployName(String employName) {
	EmployName = employName;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getConfPassword() {
	return ConfPassword;
}

public void setConfPassword(String confPassword) {
	ConfPassword = confPassword;
}

public String getSalary() {
	return Salary;
}

public void setSalary(String salary) {
	Salary = salary;
}

public String getDateOfBirth() {
	return DateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}

public String getMobileNumber() {
	return MobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	MobileNumber = mobileNumber;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

  
	

}
