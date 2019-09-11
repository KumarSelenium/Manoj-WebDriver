package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailtest2 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("Http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_d")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		driver.close();
		
	}

}
