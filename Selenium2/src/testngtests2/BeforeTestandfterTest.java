package testngtests2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestandfterTest 
{
ChromeDriver driver;

@BeforeTest
public void appLaunch()
{
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com");
	driver.manage().window().maximize();
	Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
	
}
@Test
public void appLogin()
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).isDisplayed());
}
@AfterTest
public void appClose()
{
	driver.close();
}
}
