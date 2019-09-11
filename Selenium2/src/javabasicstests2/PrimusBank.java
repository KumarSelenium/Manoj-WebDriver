package javabasicstests2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PrimusBank 
{
//appLaunch
	String res;
	ChromeDriver driver;
	String username;
	String password;
	public String appLaunch(String url)
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//Validate
		if (driver.findElement(By.id("txtuId")).isDisplayed())
				
		{
		   res="Pass";	
		} 
		
		else 
		{
			res="Fail";
		}
		return res;
		
	}
	//appLogin
	
	public String appLogin(String username, String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//validate
		if(driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).isDisplayed())
		{
			res="Pass";	
		}
		else
		{
			res="Fail";	
		}
		
		return res;
	}
	//branchCreation
	public String branchCreation(String Branchname,String Address1) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(Branchname);
		driver.findElement(By.id("txtAdd1")).sendKeys(Address1);
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
			//System.out.println("Pass");
			res="Pass";
		} else 
			if(msg.contains("already Exist"))
			{
				//System.out.println("Fail");
				res="Fail";
			}else
				if(msg.contains("Please fill in details"))
				{
					//System.out.println("warning");
					res="Warning";
					Thread.sleep(2000);
				}
		//return msg;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		return res;
		}
	
	//applogout
	
	public void applogout()
	{
		
	    driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a")).click();
	    //validate
	    if (driver.findElement(By.id("txtuId")).isDisplayed()) 
	    {
			res="Pass";
		} else 
		{
			res="Fail";
		}
	}
	//appClose
	
	public void appClose()
	{
		
		
		driver.close();
	}
	
		public static void main(String[] args) throws Exception
		{
			PrimusBank app=new PrimusBank();
			//app.appLaunch("http://primusbank.qedgetech.com/");//calling a method with method name
			String results=app.appLaunch("http://primusbank.qedgetech.com/");//storing in variable
			System.out.println(results);//calling a method with variable
			
			String results1=app.appLogin("Admin", "Admin");
			System.out.println(results1);
			
			String results2=app.branchCreation("southall", "broadstreet");
			System.out.println(results2);
			app.appClose();
		    
			
			}
		
	}
	
	
	
	
	

