package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Amazon_Actions;


public class Amazon_Test  extends Launch{
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
		//String ActualTitle = driver.getTitle();
		//System.out.println("the title of page is >>"   +" " +ActualTitle);
		String ExpectedUrl = "https://www.amazon.ca/";
		Assert.assertTrue(ActualUrl.contains(ExpectedUrl), "user is not on Amazon Page");
		System.out.println("user is on Amazon page");
		
	}
	@Test(priority = 2)
	public void verifyHamBurgermenuclick() 
	{
		//Assert.assertTrue(Amazon.HamburgerMenu.isEnabled(), "Hamberburger menu is not enable");
		Amazon.Hamburgerclick();
		
	}
	@Test(priority = 3)
	public void verifykidle() throws InterruptedException
	{
		Amazon.kindleclick();
	}
	@Test(priority = 4)
	public void verifykindleScribe()
	{
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
	    String ActualText = Amazon.EmailPhone.getText();
	    System.out.println("Actual Text  >> " +"  " +ActualText);
	    String ExpectedText = "E-mail address or mobile phone number";
	    Assert.assertTrue(ActualText.contains(ExpectedText), "Unable to verify Email and phone number");
	    System.out.println("successfully verified email and password");
	    
	}
	
  
}
