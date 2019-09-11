package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) 
	
	{
		//System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "G:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions rightclick=new Actions(driver);
		//with WebElement
		//rightclick.contextClick(gmail).sendKeys("W").build().perform();
		
		//with manual keyboard
		rightclick.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();;

	}

}
