package apachepoiday1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class Basicapachepoiprogram 
{
	public static void main(String[] args) throws IOException 
	{
		String adress = "D:\\demoexcelsheet.xlsx";
		FileInputStream file = new FileInputStream(adress);
		     XSSFWorkbook book = new XSSFWorkbook(file);
		     XSSFSheet sheet = book.getSheet("DAY1");
		     XSSFRow row = sheet.getRow(0);
		   XSSFCell cell = row.getCell(0);
		  String data = cell.getStringCellValue();
		  System.out.println(data);
		
		      String username =book.getSheet("DAY1").getRow(0).getCell(0).getStringCellValue();
		      String password =book.getSheet("DAY1").getRow(1).getCell(0).getStringCellValue();
		      System.out.println(username);

		      System.out.println(password);
		      System.out.println("End of a program");
	}

}
