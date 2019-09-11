package testngtests2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefoxbrowsertest2 
{
@Test
public void gmailTest()
{
	System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
	
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("Http://google.com");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Selenium");
	
	driver.findElement(By.className("gNO89b")).click();
}

}
