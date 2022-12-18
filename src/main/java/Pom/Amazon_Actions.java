package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import Utils.CommonMethod;

public class Amazon_Actions {
	WebDriver driver;
	CommonMethod common = new CommonMethod(DriverManager.getdriver());
	@CacheLookup
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	 public WebElement HamburgerMenu;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='hmenu-item' and @data-menu-id='4']")
	 public WebElement Kindle;
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Introducing Kindle Scribe')]")
	 public WebElement KindleScribe;
	@CacheLookup
	@FindBy(xpath ="//input[@id='buy-now-button']")
	WebElement BuyNow;
	@CacheLookup
	@FindBy(xpath=" //label[@class='a-form-label']")
	 public WebElement EmailPhone;
	
	
	
	// constructor of class
	public Amazon_Actions(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public  void Hamburgerclick() 
	
	{  
		
		clickelement(HamburgerMenu);
	}
	public void kindleclick() throws InterruptedException {
		Thread.sleep(3000);
		clickelement(Kindle);
	}
	
	public void  kindlescribeclick()
	{
		clickelement(KindleScribe);
	}
	public void BuyNowClick() 
	{
		
		clickelement(BuyNow);
		
	}
	public void clickelement(WebElement ele) 
	{
		
		
		common.higlightelement(ele);
		common.waitforelement(ele);
		//try {
		if(ele.isEnabled()) {
		
			ele.click();
		}
		else
		{
			System.out.println("element is not disabled");
		}
		//}catch(Exception e) {
			//System.out.println(e);
		}
	}


