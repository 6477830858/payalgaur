package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethod {
	WebDriver driver;
	public CommonMethod (WebDriver driver) {
		this.driver= driver;
		
	}
	 public void waitforelement(WebElement ele)
	   {
		  try {
		 WebDriverWait wait  =  new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOf(ele));
		  }catch (TimeoutException e) {
			System.out.println("Could not locate element in stipulated time");
		}
		 
	   }
		
		public void higlightelement(WebElement ele) {
			try {
				JavascriptExecutor jsexe = (JavascriptExecutor)driver;
				jsexe.executeScript("arguments[0].style.border='2px solid yellow'", ele);	
			} catch (NoSuchElementException e) {
				System.out.println(e);
			}
			
		}
		
		public void scrolleleclick(WebElement ele) {
			try {
			JavascriptExecutor jsexe = (JavascriptExecutor)driver;
			jsexe.executeScript("arguments[0].scrollIntoview();" ,ele);
			}catch (NoSuchElementException e) {
				System.out.println(e);
			}
		}
		
		public void jsclick(WebElement ele) {
			try {
			JavascriptExecutor jsexe = (JavascriptExecutor)driver;
			jsexe.executeScript("arguments[0].click();", ele);
			}catch (NoSuchElementException e) {
				System.out.println(e);
			}
		
			}
	
	
}
	
	

