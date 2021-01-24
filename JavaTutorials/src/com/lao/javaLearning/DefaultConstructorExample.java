package com.lao.javaLearning;

public class DefaultConstructorExample {

	String student_name;
	int rollNum;
	Integer ID;
	
		
	public static void main(String[] args) 
	{

		DefaultConstructorExample student = new DefaultConstructorExample();
		String StudentName =student.student_name;
		System.out.println(StudentName);
		System.out.println(student.rollNum);
		System.out.println(student.ID);
	}

}
