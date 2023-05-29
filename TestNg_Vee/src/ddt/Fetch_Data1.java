package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Data1 
{
	public static void main(String[] args)
	{
		String value = Generic.get_data("Sheet1", 0, 0);
		//System.out.println(value);
		String value1 = Generic.get_data("Sheet1", 1, 0);
		//System.out.println(value1);		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(value);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(value1);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		driver.close();
	}
}
