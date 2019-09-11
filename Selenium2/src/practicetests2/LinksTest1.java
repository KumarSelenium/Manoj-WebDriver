package practicetests2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LinksTest1 {

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.ie.driver", "G:\\IEDriverServer.exe");
		InternetExplorerDriver driver =new InternetExplorerDriver();
		driver.get("Http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			
			System.out.println(links.get(i).getText());
			
		}

	}

}
