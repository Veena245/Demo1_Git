package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic
{
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
