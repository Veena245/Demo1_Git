package ddt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data
{
	public static void main(String[] args) 
	{
		try
		{
			
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
