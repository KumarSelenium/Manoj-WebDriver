package exceltests2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingTest {

	public static void main(String[] args) throws Exception 
	{
		
		File srcfle=new File("C:\\Users\\V\\Desktop\\Automation With Java\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(srcfle);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rcnt=ws.getLastRowNum();
		for (int i = 0; i <=rcnt; i++) 
		{
			String data =ws.getRow(i).getCell(0).getStringCellValue();
			String data1 =ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data+"**"+data1);
			
		}
		
	}

}
