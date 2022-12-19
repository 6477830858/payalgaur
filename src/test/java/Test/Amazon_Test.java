package Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Amazon_Actions;
public class Amazon_Test extends Launch{
	Amazon_Actions Amazon;
	@BeforeClass(alwaysRun =  true)
	public void beforeclass()
	{
		Amazon = new Amazon_Actions(driver);
	}
	
	@Test(priority = 1)
	public void VerifyUrl()
	{
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("The actual Url is >>"    +"   "+ ActualUrl);
		String ExpectedUrl = "https://www.amazon.ca/";
		Assert.assertTrue(ActualUrl.contains(ExpectedUrl), "user is not on Amazon Page");
		System.out.println("user is on Amazon page");
		
	}
	@Test(priority = 2)
	public void verifyHamBurgermenuclick() 
	{
		
		Amazon.Hamburgerclick();
		
	}
	@Test(priority = 3)
	public void verifykidle() 
	{  
		Assert.assertTrue(Amazon.iselementenabled(Amazon.Kindle), "kindle link is not enabled");
		Amazon.kindleclick();
	}
	@Test(priority = 4)
	public void verifykindleScribe()
	
	{   Assert.assertTrue(Amazon.iselementenabled(Amazon.KindleScribe), "kindleScrible  menu is not enable");
		Amazon.kindlescribeclick();
	}
	@Test(priority = 5)
	public void verifyBuynow() 
	{
		Amazon.BuyNowClick();
		String ActualTitle = driver.getTitle();
		System.out.println("Actual Title of page  >> " +"   " + ActualTitle);
		String ExpectedTitle= "Amazon Sign In";
	   	Assert.assertTrue(ActualTitle.contains(ExpectedTitle)," user is not on signin Page");
		System.out.println("User navigate to sign in page");
	}
		@Test(priority = 6)
		public void verifysinginpage() {
	    String ActualText = Amazon.EmailPhone.getText();
	    System.out.println("Actual Text  >> " +"  " +ActualText);
	    String ExpectedText = "E-mail address or mobile phone number";
	    Assert.assertTrue(ActualText.contains(ExpectedText), "Unable to verify Email and phone number");
	    System.out.println("successfully verified email and password");
		}
	}
	
  
