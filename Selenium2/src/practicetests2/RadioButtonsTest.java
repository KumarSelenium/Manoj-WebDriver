package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> radiolists =table.findElements(By.tagName("input"));//we can give name in place of tagName(group1 and 2))
		System.out.println(radiolists.size());
		for (int i = 0; i < radiolists.size(); i++) 
		
		{
		System.out.println(radiolists.get(i).getAttribute("checked")+"----"+radiolists.get(i).getAttribute("value")+"----"+radiolists.get(i).getAttribute("name"));
			
		}


	}

}
