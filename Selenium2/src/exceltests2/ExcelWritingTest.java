package exceltests2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritingTest {

	public static void main(String[] args) throws Exception 
	{
		//File Location
		File fle=new File("C:\\Users\\V\\Desktop\\Automation With Java\\Book1.xlsx");
		//File Input stream
		FileInputStream fis=new FileInputStream(fle);
		//Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Sheet name
		XSSFSheet ws=wb.getSheet("Sheet1");
		//writing data in to excel
		ws.getRow(1).createCell(2).setCellValue("Manoj");
		ws.getRow(2).createCell(2).setCellValue("Selenium");
		ws.getRow(3).createCell(2).setCellValue("Vasutrainer");
		//File output Stream
		FileOutputStream fos=new FileOutputStream(fle);
		//write() method
		wb.write(fos);
		wb.close();
		
		
		

	}

}
