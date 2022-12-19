package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import Base.DriverManager;

public class Launch {
	
	WebDriver driver;
	DriverManager dm = new DriverManager();
	@Parameters({"browser","url"})
	@BeforeTest(alwaysRun = true)
	public void beforeTest( String Browser , String Url)
	{    dm.setup(Browser , Url);
   		driver = DriverManager.getdriver();
	}
	
	@AfterTest(alwaysRun = true)
      public void aftersuit()
	{
		dm.teardown();
		
	}
	
  
}
