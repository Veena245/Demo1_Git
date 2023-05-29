package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import generic.Base_Test;
import pom_scripts.Pom1;

public class TestScript1 extends Base_Test
{
	@Test(dataProvider = "data" )
	public void login(String d1, String d2)
	{
		Pom1 p=new Pom1(driver);
		p.usrname(d1);
		p.pwd(d2);
		p.btn();	
	}
	
	@DataProvider(name="data")
	public Object[][] createData1()
	{
		return new Object[][]
		{
			{"im_veena", "12346575"},
			{"veena", "12345678"}
				
		};
	}

}
