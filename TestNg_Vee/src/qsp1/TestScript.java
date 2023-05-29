package qsp1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript extends GenericScript
{
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("im_veena_reddy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vee12345");
		driver.findElement(By.xpath("//button[.='Log in']")).click();	
	
	}

}
