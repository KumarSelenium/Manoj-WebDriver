package practicetests2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreenshots {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		
		List<WebElement> headerlinks=driver.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		for (int i = 0; i < headerlinks.size(); i++)
		{
			String linkNames=headerlinks.get(i).getText();
			headerlinks.get(i).click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcFile=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\V\\eclipse-workspace\\ManojSelenium\\Selenium2\\"+linkNames+".png"));
			
			driver.navigate().back();
			headerlinks=driver.findElements(By.tagName("a"));
				
		}

	}

}
