package practicetests2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DynamicXpath 
{
 @Test	
	public  void  dynamicXpathtest() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://yahoo.com/");
		driver.manage().window().maximize();
		
	
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.tagName("uh-search-button")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15')]/div/div/div/ul/li/span/span/b"));
		System.out.println(list.size());
		
		list.get(2);
		


	}

}
