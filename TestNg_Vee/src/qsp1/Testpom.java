package qsp1;

import org.testng.annotations.Test;

public class Testpom extends Generic
{
	@Test
	public void login() throws InterruptedException 
	{
		POM_Class p=new POM_Class(driver);
		p.usrname("Im_Veena");
		Thread.sleep(2000);
		p.pwd("veena");
		Thread.sleep(2000);
		p.btn();
	}

}
