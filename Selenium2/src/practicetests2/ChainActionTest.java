package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement shopall=driver.findElement(By.xpath("//*[@id=\'nav-link-shopall\']"));
		WebElement apv=driver.findElement(By.xpath("//*[@id=\'nav-flyout-shopAll\']/div[2]/span[4]"));
        WebElement allvideos=driver.findElement(By.xpath("//span[contains(text(),'All Videos')]"));//relative xpath
        
        Actions chain=new Actions(driver);
        chain.moveToElement(shopall).moveToElement(apv).pause(2000).moveToElement(allvideos).click().build().perform();
	}

}
