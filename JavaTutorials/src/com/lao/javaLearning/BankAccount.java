package com.lao.javaLearning;

public class BankAccount {

	
	Long accountNum  =1234567890l;//append with length		
	String holderName ="Naveen";
	Integer accountBal= 50000;
	

	public void getBalance() //user defined method
	{
		System.out.println("Account Balance "+accountBal);
	}
	
	
	
	public static void main(String[] args) // main method execution start point
	{
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.getBalance();
		
	}

}
