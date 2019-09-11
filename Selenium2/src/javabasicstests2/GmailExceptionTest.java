package javabasicstests2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailExceptionTest {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://google.com");
		driver.manage().window().maximize();
        
		try 
		{
			driver.findElement(By.linkText("ManojGmailinsteadof")).click();
			
		} catch (Exception e) 
		
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcFile=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\V\\eclipse-workspace\\ManojSelenium\\Selenium2\\Exception.png"));
		}
		
		
	}

}
