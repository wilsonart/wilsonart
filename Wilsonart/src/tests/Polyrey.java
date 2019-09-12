package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;

@Listeners(wa_reportGenerator.CustomListener.class)
public class Polyrey extends BaseClass {
  
	
	HomePage hp;
	
	@Parameters({ "browser","polyrey" })
	public Polyrey(String browsr, String URL)
	{
		//super.browser=browsr;
		super.URL=URL;
		
		//System.out.println("browser  "+browsr);
		//System.out.println("URL   "+URL);
	}
	
		
	@Parameters({ "username","passwd"})
	@Test
	public void signin(String uname, String pwd) throws Throwable {
		  hp = new HomePage(driver);
		  Thread.sleep(5000);
		  System.out.println("username"+uname);
		  System.out.println("password"+pwd);
		  hp.Clickonlink();
		  Thread.sleep(6000);
		  driver.findElement(By.id("loginemail")).sendKeys(uname);
		  driver.findElement(By.id("loginpassword")).sendKeys(pwd);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		   	  	  
	  }
	
	@Test
	public void validate_footerlinks(){
		Assert.assertFalse(true);
	}
	
	@Test
	public void validate_topmenulinks()
	{
	Assert.assertTrue(true);
	}
	

	}
