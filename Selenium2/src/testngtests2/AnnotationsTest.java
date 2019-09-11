package testngtests2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
     @Test
     public void method1()
     {
	 System.out.println("Method1 Executed"); 
     }
     @BeforeTest
     public void beforeTest() 
     {
	 System.out.println("beforeTest Executed"); 
	 }
	 
	 @AfterTest 
	 public void afterTest() 
	 {
	 System.out.println("afterTest Executed"); 
	 }
	 
	 @Test
     public void method2()
     {
	 System.out.println("Method2 Executed"); 
     }
	
	
	  @BeforeMethod 
	  public void beforeMethod() 
	  {
	  System.out.println("beforeMethod Executed"); 
	  }
	  
	  @AfterMethod 
	  public void afterMethod() 
	  {
	  System.out.println("afterMethod Executed"); 
	  }
	 
			

	}


