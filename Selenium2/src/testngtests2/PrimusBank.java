
package testngtests2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//reusable methods
public class PrimusBank 
{
	ChromeDriver driver;

	@BeforeSuite
	public void appLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
	}

	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
	}
	@AfterTest
	public void appLogout() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a")).click();
	}
	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
}
