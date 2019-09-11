package practicetests2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowsertest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://google.co.uk");

	}

}
