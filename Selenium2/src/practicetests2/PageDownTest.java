package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jquery.com/");
		driver.manage().window().maximize();

		Actions scroll=new Actions(driver);
		scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		
		
	}

}
