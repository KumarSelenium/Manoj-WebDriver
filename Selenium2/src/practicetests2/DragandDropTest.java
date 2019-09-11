 package practicetests2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		List<WebElement> framescount=driver.findElements(By.tagName("iframe"));
		System.out.println(framescount.size());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement dra=driver.findElement(By.id("draggable"));
		WebElement dro=driver.findElement(By.id("droppable"));
		
		Actions DrapAndDrop=new Actions(driver);
		
		DrapAndDrop.dragAndDrop(dra, dro).build().perform();
		
		driver.switchTo().defaultContent();

	}

}
