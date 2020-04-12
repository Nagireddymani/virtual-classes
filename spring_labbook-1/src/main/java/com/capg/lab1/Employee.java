package com.capg.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	
	private int employeeId=1234;
	
	private String employeeName="Manik";
	
	private double employeeSalary=40000;
	
	//private String BU="PES-BU";
	@Autowired
	private SBU bussinessUnit;
	
	//private int employeeAge=30;
	
	public Employee()
	{
		
	}
	public Employee(int employeeId, String employeeName, double employeeSalary)
//			, SBU bussinessUnit, int employeeAge) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		//this.BU = bU;
//		this.bussinessUnit=bussinessUnit;
//		this.employeeAge = employeeAge;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
//	public String getBU() {
//		return BU;
//	}
//	public void setBU(String bU) {
//		BU = bU;
//	}
//	public int getEmployeeAge() {
//		return employeeAge;
//	}
//	public SBU getBussinessUnit() {
//		return bussinessUnit;
//	}
//	public void setBussinessUnit(SBU bussinessUnit) {
//		this.bussinessUnit = bussinessUnit;
//	}
//	public void setEmployeeAge(int employeeAge) {
//		this.employeeAge = employeeAge;
//	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary+"]"; 
//				+ ", BU=" + bussinessUnit + ", employeeAge=" + employeeAge + "]";
	}
	public void display()
	{
		System.out.println("Employee Details ");
		System.out.println("-------------------------------------------------");
		System.out.println("Employee ID           : "+employeeId);
		System.out.println("Employee Name         : "+employeeName);
		System.out.println("Employee Salary       : "+employeeSalary);
		//System.out.println("Employee BU           : "+bussinessUnit.toString());
		//System.out.println("Employee Age          : "+employeeAge);
		
	}
	
	
	
}
