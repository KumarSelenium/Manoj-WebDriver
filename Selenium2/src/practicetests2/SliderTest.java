package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement s1=driver.findElement(By.xpath("//div[@id='slider']"));
		
		Actions slider=new Actions(driver);
		slider.clickAndHold(s1).moveByOffset(200, 0).release(s1).build().perform();
		Thread.sleep(2000);
		slider.clickAndHold(s1).moveByOffset(-200, 0).release(s1).build().perform();
		
	

	}

}
