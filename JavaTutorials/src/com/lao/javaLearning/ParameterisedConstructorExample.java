package com.lao.javaLearning;

public class ParameterisedConstructorExample {
 
	
	String EmployeeName;
	int EmployeeId;
	
	ParameterisedConstructorExample() 
	{
		String EmployeeName = "Naveen";
		int EmployeeId = 1211;
		System.out.println("This non parametised constructor");
	}
	
	ParameterisedConstructorExample(String name, int id)
	{
		EmployeeName = name;
		EmployeeId = id;
	}
	
	public void employeeDetails() 
	{
		System.out.println("Employee Name is "+EmployeeName);
		System.out.println("Employee ID is "+EmployeeId);
	}
	
	
	public static void main(String[] args) 
	{
		ParameterisedConstructorExample employee = new ParameterisedConstructorExample();
		employee.employeeDetails();
		ParameterisedConstructorExample employee2 = new ParameterisedConstructorExample("Naveen", 1000);
		employee2.employeeDetails();
		ParameterisedConstructorExample employee3 = new ParameterisedConstructorExample("Raj", 320);
		employee3.employeeDetails();

	}

}
