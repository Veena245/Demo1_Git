package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_FetchData;
import pom_scripts.Pom1;

public class TestScript2 extends Base_Test
{
	@Test
	public void login() throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		String usr = Generic_FetchData.get_data("Sheet1", 0, 0);
		p.usrname(usr);
		String pw = Generic_FetchData.get_data("Sheet1", 1, 0);
		p.pwd(pw);
		p.btn();
		Thread.sleep(2000);
		//Assert.fail();
		
	}

}
