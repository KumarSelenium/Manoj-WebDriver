package practicetests2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://tinypic.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='the_file']")).click();
		  //driver.findElement(By.xpath("//input[@id='the_file']")).sendKeys("C:\\\\Users\\\\V\\\\Desktop\\\\FileUpload.exe");
		
		//AutoIT
		Runtime.getRuntime().exec("C:\\Users\\V\\Desktop\\FileUpload1.exe");

	}

}
