package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript
{
	WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
