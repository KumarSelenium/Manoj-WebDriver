package practicetests2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img\r\n" + "")).click();
		
		String homepage=driver.getWindowHandle();
		System.out.println(homepage);
		
		//driver.findElement(By.className("popupCloseButton")).click();
		
		driver.findElement(By.id("loginsubmit")).click();
        String child=driver.getWindowHandle();
        System.out.println(child);
	}

}
