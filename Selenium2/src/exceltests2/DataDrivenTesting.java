package exceltests2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javabasicstests2.PrimusBank;

public class DataDrivenTesting {

	public static void main(String[] args) throws Exception 
	{
		
		PrimusBank app=new PrimusBank();
		app.appLaunch("http://primusbank.qedgetech.com/");
		app.appLogin("Admin", "Admin");
		
	
        File srcfle=new File("C:\\Users\\V\\Desktop\\Automation With Java\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(srcfle);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rcnt=ws.getLastRowNum();
		for (int i = 0; i <=rcnt; i++) 
		{
			String branchName =ws.getRow(i).getCell(0).getStringCellValue();
			String add1 =ws.getRow(i).getCell(1).getStringCellValue();
			
			String results=app.branchCreation(branchName, add1);
			
			ws.getRow(i).createCell(2).setCellValue(results);
			
			FileOutputStream fos=new FileOutputStream(srcfle);
			wb.write(fos);
			
		}
            wb.close();
            app.applogout();
            app.appClose();
	}

}
