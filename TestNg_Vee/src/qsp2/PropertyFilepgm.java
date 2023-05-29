package qsp2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFilepgm 
{
	@Test
	public void test1() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		System.out.println(p.getProperty("id"));
	}

}
