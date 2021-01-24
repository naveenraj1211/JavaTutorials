package com.lao.obstraction;

public class BMW extends car implements UpcomingProjects,Interface2
{
	@Override
	public void engineSecret() 
	{
		System.out.println("BMW Car engine secret....");
	}
	
	@Override
	public void companyVault() 
	{
		System.out.println("BMW Car company vault....");
	}
	
	@Override
	public void method() 
	{
		System.out.println("method inside interface class");
	}
	
	
	public static void main(String[] args) 
	{
		car car = new BMW();
		car.engineSecret();
		car.companyVault();
		
	}
}
