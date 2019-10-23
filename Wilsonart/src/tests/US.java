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
public class US extends BaseClass {
  
	
	HomePage hp;
	
	@Parameters({"browser","wilsonart"})
	public US(String browsr, String URL)
	{
		//super.browser=browsr;
		super.URL=URL;
		
		//System.out.println("browser  "+browsr);
		//System.out.println("URL  "+URL);
	}
	
			
	 /* @Parameters({ "username","passwd"})
	  @Test
	  public void signin(String uname, String pwd) throws Throwable {
			  hp = new HomePage(driver);
			  Thread.sleep(10000);
			  System.out.println("username"+uname);
			  System.out.println("password"+pwd);
			  hp.Clickonlink();
			  driver.findElement(By.id("email")).sendKeys(uname); //id = email
			  driver.findElement(By.id("pass")).sendKeys(pwd); //id = pass
			  Thread.sleep(7000);
			  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			  Thread.sleep(5000);
			  //Assert.assertTrue(true);
			  Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),'Sign Out')])[1]")).isDisplayed(), "Post Login Page found"); 
			//(//*[contains(text(),'Sign Out')])[1]
		  }*/
	  
		  

	
	/*@Test
	public void Find_Your_Surface() throws Exception
	    {
		hp = new HomePage(driver);
		System.out.println("Find your Surface started..");
		//Thread.sleep(20000);
		hp.presstab();
		}*/
	
	/*@Parameters({ "finish" })
		@Test
	public void Quick_Search(String finish) throws Exception
	{
		hp = new HomePage(driver);
		hp.entersearchkey(finish);
		Thread.sleep(20000);
	    hp.Clickonsearchbutton();
	}*/
	
	/*@Test
	public void Product_Listing()
	{
		hp = new HomePage(driver);
		hp.HovertoProducts();
	}*/
	
	/*@Test
	public void Shopping_Cart()
	{
	Assert.assertFalse(true);
	}
	
	@Test
	public void Checkout()
	{
	Assert.assertFalse(true);
	}*/
	
	
	@Parameters({ "Fname","Lname","Company", "Email","Passwd"})
	@Test
	public void New_Account_Registration(String Fname, String Lname, String Company, String Email, String Passwd) throws Exception
	{
	hp = new HomePage(driver);
	hp.ClickonRegister();
	Thread.sleep(20000);
	hp.SelectPrefix(2);
	Thread.sleep(5000);
	hp.FilltheForm(Fname, Lname, Company, Email, Passwd);
	Thread.sleep(5000);
	hp.click_CreateAccount();
	Thread.sleep(20000);
	}
	

}
	
