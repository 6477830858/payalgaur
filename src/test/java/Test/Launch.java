package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.DriverManager;

public class Launch {
	
	WebDriver driver;
	DriverManager dm = new DriverManager();
	@Parameters({"browser","url"})
	@BeforeSuite
	public void beforesuit( String Browser , String Url)
	{    dm.setup(Browser , Url);
		//dm.setup("firefox", "https://www.amazon.ca");
		driver = DriverManager.getdriver();
	}
	
	@AfterSuite
public void aftersuit()
	{
		dm.teardown();
		
	}
	
  @Test
  public void f() {
  }
}
