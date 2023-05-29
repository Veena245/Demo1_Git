
package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Data
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		for (int i = 0; i < count; i++)
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			String v = links.get(i).getAttribute("href");
			c.setCellValue(v);
			
		}
				
		
		FileOutputStream fos=new FileOutputStream("./Excel/TestData.xlsx");
		book.write(fos);
		
	}
	

}
