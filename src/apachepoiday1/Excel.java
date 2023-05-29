package apachepoiday1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static void main(String[] args) throws IOException 
	{
		String adress = "D:\\demoexcelsheet.xlsx";
		FileInputStream file = new FileInputStream (adress);
		XSSFWorkbook book = new XSSFWorkbook(file);
		   XSSFSheet sheet  = book.getSheet("DAY1");
//		        XSSFRow row = sheet.getRow(0);
//		                 XSSFCell cell = row.getCell(0);
//		     String data =cell.getStringCellValue();
//		     System.out.println(data);
//	//===========================================================================================//
//		     book.getSheet(data).getRow(0).getCell(0).getRichStringCellValue();
//		     
		     //====================================================================================//
		     for(int i=0;i<3;i++)
		     {
		    	 for(int j=0;j<2;j++)
		    	 {
		    		String Value = sheet.getRow(i).getCell(j).getStringCellValue();
		    		 System.out.print(Value +" ");
		    	 }
		    	    System.out.println();
		     }
	}
	
}
