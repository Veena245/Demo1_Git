package test_scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport1 
{
	@Test
	public void test1()
	{
		ExtentReports rep = new ExtentReports("./report.r1.html");
		ExtentTest ext = rep.startTest("tc");
		ext.log(LogStatus.PASS, "Pass");
		ext.log(LogStatus.FAIL, "Fail");
		ext.log(LogStatus.SKIP, "Skip");
		rep.endTest(ext);
		rep.flush();
	}

}
