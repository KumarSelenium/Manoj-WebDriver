package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement> countrylist=driver.findElements(By.tagName("option"));
		for(int i=0; i<countrylist.size(); i++)
		{
			countrylist.get(i).isDisplayed();
			
			if(countrylist.get(i).isDisplayed())
			{
				
				System.out.println(countrylist.get(i).getText()+".....is Selected");
				
				}
			else {
				System.out.println(countrylist.get(i).getText()+".....not Selected");
			}
		}

	}

}
