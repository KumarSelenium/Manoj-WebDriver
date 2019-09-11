package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> droplist=drop.findElements(By.tagName("option"));
		
		System.out.println(droplist.size());
		
		for (int i = 0; i < droplist.size(); i++) 
		{
			//System.out.println(droplist.get(i).getText());
			//if (droplist.get(i).getText().equals("Alexa Skills")) 
			//{
			//	droplist.get(i).click();
			//}
			
			droplist.get(i).click();
			
			}
       }
	  }
