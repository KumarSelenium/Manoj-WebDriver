package testngtests2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablesTest 
{
ChromeDriver driver;
@Test
public void webTable()
{
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
	//System.out.println(rows.size());
	
	for (int i = 0; i < rows.size(); i++) 
	{
		List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
		//System.out.println(col.size());
		//for (int j = 0; j < col.size(); j++) 
		//{
			System.out.println(col.get(2).getText());//get(j)
		//}
	}
	
	
	
}

}
