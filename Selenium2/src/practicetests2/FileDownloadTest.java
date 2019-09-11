package practicetests2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadTest {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\V\\Desktop\\AutiIT Files\\FileDownload.exe");
		

	}

}
