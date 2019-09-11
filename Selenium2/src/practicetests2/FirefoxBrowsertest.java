package practicetests2;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowsertest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("Http://google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gLFyf gsfi")).sendKeys("Selenium");
		
		driver.findElement(By.id("searchSubmit")).click();


}

}
