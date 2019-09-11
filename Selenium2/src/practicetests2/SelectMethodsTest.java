package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("month"));
		
		Select s1=new Select(drop);
		//s1.selectByIndex(2);
		//s1.selectByValue("2");
		//s1.selectByVisibleText("Feb");
		List<WebElement> droplist=s1.getOptions();
		System.out.println(droplist.size());
		for (WebElement items : droplist) 
		{
			System.out.println(items.getText());
		}

	}

}
