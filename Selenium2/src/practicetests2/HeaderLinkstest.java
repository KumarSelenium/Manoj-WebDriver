package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinkstest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		WebElement header=driver.findElement(By.id("nav-xshop-container"));
		List<WebElement> headerlinks=header.findElements(By.tagName("a"));
		for (WebElement element : headerlinks) 
		{
			System.out.println(element.getText());
		}
		

	}

}
