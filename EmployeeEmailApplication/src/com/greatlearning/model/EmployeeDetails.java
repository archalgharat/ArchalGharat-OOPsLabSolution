package com.greatlearning.model;

public class EmployeeDetails {
	private String strFirstName;
	private String strLastName;
	
	public String getStrFirstName() {
		return strFirstName;
	}
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	public String getStrLastName() {
		return strLastName;
	}
	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	
	public EmployeeDetails (String FirstName, String LastName) {
		this.strFirstName = FirstName;
		this.strLastName = LastName;
	}
	
}
