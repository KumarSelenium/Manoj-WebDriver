package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckBoxes {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> checklist=table.findElements(By.tagName("input"));
		System.out.println(checklist.size());
		
		for(int i=0; i<checklist.size(); i++ )
		{
			//System.out.println(checklist.get(i).getAttribute("checked")+"#####"+checklist.get(i).getAttribute("value"));
			
			//click on all radio buttons
			//checklist.get(i).click();
			
			if (checklist.get(i).getAttribute("value").equals("Cheese")) 
			{
				checklist.get(i).click();
			}
			
		}

	}

}
