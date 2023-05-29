package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Pom1 extends Base_Page
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement usrname;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	public Pom1(WebDriver driver)
	{
		super(driver);
	}
	public void usrname(String un)
	{
		usrname.sendKeys(un);
	}
	public void pwd(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	public void btn()
	{
		btn.click();
	}
}

