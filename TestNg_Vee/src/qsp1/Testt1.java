package qsp1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testt1 extends Generic
{
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Oppo mobiles");
	}
	
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.fail();
	}

}
