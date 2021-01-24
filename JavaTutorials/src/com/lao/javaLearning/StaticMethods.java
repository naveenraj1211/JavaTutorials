package com.lao.javaLearning;

public class StaticMethods {

	static String bankName;
	int pincode;

	
	public static void staticMethod() 
	{
		System.out.println("This is static method; we can access without object");
	}
	public void nonStaticMethod() 
	{
		staticMethod();
		System.out.println("This is NON static method");
	}	
	
	static {System.out.println("First static block");} // static will execute first before main method
	static {System.out.println("Second static block");}
	
	
	public static void main(String[] args) 
	{
		staticMethod();
		System.out.println(bankName="directly we can assign values");
		
		StaticMethods methods = new StaticMethods();
		methods.nonStaticMethod();
		methods.bankName="Indin Bank";
		methods.pincode=603403;
		
		StaticMethods methods1 = new StaticMethods();
		methods1.bankName="HDFC BANK";
		methods1.pincode=600021;
		
		System.out.println("Object 1 bankName "+methods.bankName);
		System.out.println("Object 1 pincode "+methods.pincode);
		
		System.out.println("Object 2 bankName "+methods1.bankName);
		System.out.println("Object 2 pincode "+methods1.pincode);
		
		
	}

}
