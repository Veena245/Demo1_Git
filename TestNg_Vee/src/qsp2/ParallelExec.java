package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec
{
	public WebDriver driver; 
	@Parameters({"browsers"})
	@Test
	public void test(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.close();
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.close();
		}
	}

}
