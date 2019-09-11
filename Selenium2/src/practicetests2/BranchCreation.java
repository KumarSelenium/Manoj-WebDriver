package practicetests2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreation {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
		driver.findElement(By.id("BtnNewBR")).click();
        
		driver.findElement(By.id("txtbName")).sendKeys("London");
		driver.findElement(By.id("txtAdd1")).sendKeys("LondonStreet");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("btn_insert")).click();
		
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		//validation
		if (msg.contains("created Sucessfully")) 
		{
			System.out.println("Pass");
		} else 
			if(msg.contains("already exist"))
			{
				System.out.println("Fail");
			}else
				if(msg.contains("please fill in details"))
				{
					System.out.println("warning");
				}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
		driver.close();
		  {
            
		}
		
	 }
	}
