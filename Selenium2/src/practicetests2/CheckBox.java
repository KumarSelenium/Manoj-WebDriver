package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("remember")).click();
		//Display checkbox status - Before
		System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		if (driver.findElement(By.id("remember")).isDisplayed()) 
		{
		
			driver.findElement(By.id("remember")).click();
			//Display checkbox status - After
			System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
			
		}

	}

}
