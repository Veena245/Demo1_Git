package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page 
{
	public WebDriver driver; //to use in pom script
	public Base_Page(WebDriver driver)//this is to give reference to Ln 11
	{
		PageFactory.initElements(driver, this);
	}

}
