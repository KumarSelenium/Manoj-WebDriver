package javabasicstests2;

public class HandlingExceptions {

	public static void main(String[] args) 
	{
		System.out.println("Selenium");
		
		try 
		{
			System.out.println(100/0);
		} catch (Exception e) 
		
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Manoj");

	}

}
