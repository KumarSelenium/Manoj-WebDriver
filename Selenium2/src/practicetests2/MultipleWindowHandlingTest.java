package practicetests2;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandlingTest {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String> windows=driver.getWindowHandles();
		for (String child : windows) 
		{
			//System.out.println(child);
			driver.switchTo().window(child);
			if (!driver.getTitle().equals("Amazon")) 
			{
				driver.close();
			}
			//System.out.println(driver.getTitle());
			//Thread.sleep(2000);
			//driver.close();
			
			
		}
		

	}

}
