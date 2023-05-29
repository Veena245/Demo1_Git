package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement usrname;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[.='submit']")
	private WebElement btn;
	
	public POM_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
