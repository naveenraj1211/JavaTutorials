package com.lao.javaLearning;

public class You {

	public void makeYourGirlLaugh() 
	{
		try 
		{   int num1 = 1;
			int num2 = 0;
			int  result = num1/num2;
			System.out.println(result);
			System.out.println("After Exception");
			throw new MachanInterruptedException("Machan is coming to hit you");
		} 
		catch (MachanInterruptedException e) 
		{
			//e.printStackTrace();
			System.out.println("Your friend: Machan..! give this pose da");
			System.out.println("action like giving pose for INSTGRAM");
		}
		catch (ArithmeticException e) 
		{
			//e.printStackTrace();
			System.out.println("Dont divide a num by zero");
			
		}
		catch (Exception e) 
		{
			//e.printStackTrace();
			System.out.println("Drink lemon juicea");			
		}
		finally
		{
			System.out.println("this finally block");			
		}
	}
	
	public static void main(String[] args) 
	{
		You you = new You();
		you.makeYourGirlLaugh();

	}

}
