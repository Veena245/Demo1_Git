package qsp1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifivationUsingAssert extends Generic
{
	@Test
	public void login()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Oppo mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String t = driver.getTitle();
		System.out.println(t); 
		Assert.assertEquals(t, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("1");
	}

}
