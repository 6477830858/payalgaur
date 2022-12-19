package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverManager {
	public static WebDriver driver;
	public void setup ( String browser , String url) {
		
		
		String path = System.getProperty("user.dir");
		System.out.println("returning the location my dr>>" +path);
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", path+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("this is launched browser" +browser);
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", path+"\\Driver\\geckodriver.exe")	;	
			
			 System.out.println("this is launched browser>>" + browser);
				driver = new FirefoxDriver();}
		else if (browser.equalsIgnoreCase("edge")) {
			
			 System.setProperty("webdriver.edge.driver", path+"\\Driver\\msedgedriver.exe")	;	
			
			 System.out.println("this is launched browser>>" + browser);
				driver = new EdgeDriver();}
		
		
	else if (browser.equalsIgnoreCase("opera")) {
	System.setProperty("webdriver.opera.driver", path+"\\Driver\\operadriver.exe");
	System.out.println("this is launched browser>>" + browser);
	
	driver = new OperaDriver();

	}
	else
	{
		System.out.println("this is not correct of browser>>" + browser);}
	
	
		if (url!="") {
			driver.get(url);
			System.out.println("this my url" + url);
	}
	else {
			driver.get("about:blank");// this will not fail your script it will quit if you forgot the url
		System.out.println("the url is blank or not as expectes>>"+ url);
	
		
		}

		driver.manage().window().maximize();// it is used to maximize the screen of url
		try {
			Thread.sleep(3000);// it will wait for 3 sec
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
	
		
	}
		
				public void teardown() {
			driver.quit();
		}
	
	public  static WebDriver getdriver()
	{
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	