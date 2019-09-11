package javabasicstests2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class StringValidationtestcase {

    public static void main(String[] args) 
		{
    	    //Validation
    	    //String expTitle="Gmail";
    	    
			FirefoxDriver driver =new FirefoxDriver();
			driver.get("Http://google.com");
			driver.manage().window().maximize();
			driver.findElement(By.className("gb_d")).click();
			
			//Validation
			//String actTitle=driver.getTitle();
			if(driver.findElement(By.id("gb_d")).isDisplayed())
			{
				System.out.println("driver.getTitle");//pass
			}else {
				System.out.println("driver.getTitle");//Fail
			}

	}

}
