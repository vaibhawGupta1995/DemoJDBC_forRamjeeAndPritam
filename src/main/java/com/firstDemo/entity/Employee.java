package com.firstDemo.entity;

public class Employee {
	private String fName;
	private String lName;
	private String location;
	
	public String getfName() {
		
		return fName;
	}
	public void setfName(String fName) {
		System.out.println("Inside setter first name");
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		System.out.println("Inside setter last name");
		this.lName = lName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		System.out.println("Inside setter location");
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", location=" + location + "]";
	}
	
	
	
}
