package practicetests2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("login")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		
		
		
		

	}

}
