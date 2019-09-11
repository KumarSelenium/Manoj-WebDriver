package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodMultipleDropDowns {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(12);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(12);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByIndex(12);
		
		

	}

}
