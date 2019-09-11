package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizabletest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement resizable=driver.findElement(By.id("resizable"));//xpath
		
		Actions rzle=new Actions(driver);
		rzle.clickAndHold(resizable).moveByOffset(400, 150).release(resizable).build().perform();

	}

}
