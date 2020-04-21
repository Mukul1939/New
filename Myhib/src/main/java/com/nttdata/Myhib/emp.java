package com.nttdata.Myhib;

public class emp {
	
	private int empId;
	private String empName;
	private double empSalary;
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public double getempSalary() {
		return empSalary;
	}
	public void setempSalary(double employeeSalary) {
		this.empSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public emp() {
		super();
	}
	public emp(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

}
