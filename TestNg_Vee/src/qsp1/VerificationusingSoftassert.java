package qsp1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationusingSoftassert  extends Generic
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
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(t, "Online Shopping");
			System.out.println("1");
			sa.assertAll();
		}

}
