package tests;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Common;
import pages.HomePage;
import pages.ProductMenu;
@Listeners(wa_reportGenerator.CustomListener.class)
public class US extends BaseClass {
    
	ProductMenu PM;
	HomePage hp;
	TakeScreenShot TS;
	@Parameters({"browser","wilsonart"})
	public US(String browsr, String URL) throws IOException
	{
		super.browser=browsr;
		super.URL=URL;
		System.out.println("browser  "+browsr);
		System.out.println("URL  "+URL);
	}
	   @Test
	   public void Signin() throws Throwable {
		  hp = new HomePage(driver);
		  Thread.sleep(10000);
		  System.out.println(Common.fromProperties("Configuration", "username"));
		  System.out.println(Common.fromProperties("Configuration", "password"));
		  hp.Clickonlink();
		  hp.SignInToApplication(Common.fromProperties("Configuration", "username"),Common.fromProperties("Configuration", "password"),Common.fromProperties("Configuration", "Expected"));
		  //Thread.sleep(5000);
		  //Assert.assertTrue(true);
		  //Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),'Sign Out')])[1]")).isDisplayed(), "Post Login Page found"); 
	   }
	@Test
	public void Checkout() throws Throwable
	{
		  PM = new ProductMenu(driver);
		  hp = new HomePage(driver);
		  Thread.sleep(10000);
		  System.out.println(Common.fromProperties("Configuration", "username"));
		  System.out.println(Common.fromProperties("Configuration", "password"));
		  hp.Clickonlink();
		  hp.SignInToApplication(Common.fromProperties("Configuration", "username"),Common.fromProperties("Configuration", "password"),"");
		  Thread.sleep(5000);
		  PM.productCheckout();	
		  //TS.takeSnapShot(webdriver,fileWithPath);
		  
	  }
	@Test
	public void Find_Your_Surface() throws Throwable
	    {
		  hp = new HomePage(driver);
		  Thread.sleep(10000);
		  System.out.println(Common.fromProperties("Configuration", "username"));
		  System.out.println(Common.fromProperties("Configuration", "password"));
		  hp.Clickonlink();
		  hp.SignInToApplication(Common.fromProperties("Configuration", "username"),Common.fromProperties("Configuration", "password"),"");
		  Thread.sleep(5000);
		  hp.advance_search();
		}
	
		@Test
	public void Quick_Search(String fileWithPath, WebDriver webdriver) throws Exception
	{
		  hp = new HomePage(driver);
		  TS = new TakeScreenShot();
		  Thread.sleep(10000);
		  System.out.println(Common.fromProperties("Configuration", "username"));
		  System.out.println(Common.fromProperties("Configuration", "password"));
		  hp.Clickonlink();
		  hp.SignInToApplication(Common.fromProperties("Configuration", "username"),Common.fromProperties("Configuration", "password"),"");
		  Thread.sleep(5000);
		  hp.entersearchkey(Common.fromProperties("Configuration", "search_item"));
		  Thread.sleep(10000);
	      hp.Clickonsearchbutton();
	      TS.takeSnapShot(webdriver,fileWithPath);
	}
	
	@Test
	public void Product_Listing() throws Throwable
	{
		  hp = new HomePage(driver);
		  Thread.sleep(10000);
		  System.out.println(Common.fromProperties("Configuration", "username"));
		  System.out.println(Common.fromProperties("Configuration", "password"));
		  hp.Clickonlink();
		  hp.SignInToApplication(Common.fromProperties("Configuration", "username"),Common.fromProperties("Configuration", "password"),"");
		  Thread.sleep(5000);
		  hp.HovertoProducts();
	}
	
	@Test
	public void Shopping_Cart() throws Throwable
	{
		  PM = new ProductMenu(driver);
		  hp = new HomePage(driver);
		  Thread.sleep(10000);
		  System.out.println(Common.fromProperties("Configuration", "username"));
		  System.out.println(Common.fromProperties("Configuration", "password"));
		  hp.Clickonlink();
		  hp.SignInToApplication(Common.fromProperties("Configuration", "username"),Common.fromProperties("Configuration", "password"),"");
		  Thread.sleep(5000);
		  PM.MyCart();
	}

	@Test
	public void New_Account_Registration() throws Throwable
	{
	hp = new HomePage(driver);
	hp.UserRegistration(Common.fromProperties("Configuration", "Email"),Common.fromProperties("Configuration", "Passwd"));

	}
	
}
	
