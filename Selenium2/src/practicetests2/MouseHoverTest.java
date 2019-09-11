package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverTest {

	public static void main(String[] args) throws Throwable 
	{
		//System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
       
		
		WebElement signin=driver.findElement(By.id("nav-link-yourAccount"));
		WebElement starthere=driver.findElement(By.xpath("//*[@id=\'nav-flyout-ya-newCust\']/a"));
		
		Actions mouse=new Actions(driver);
		Thread.sleep(2000);
		mouse.moveToElement(signin).build().perform();
		mouse.moveToElement(starthere).click().build().perform();
		
	}

}
