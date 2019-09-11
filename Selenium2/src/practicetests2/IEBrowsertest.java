package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowsertest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "G:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		//driver.get("Http://bbc.co.uk");
		driver.get("Http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_d")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();

	}

}
