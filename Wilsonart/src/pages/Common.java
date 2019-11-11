package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.w3c.dom.Element;

import tests.BaseClass;
@Listeners(wa_reportGenerator.CustomListener.class)
public class Common extends BaseClass {
	public static WebDriver driver;
	public static HomePage hp;
	@Parameters({"browser","wilsonart"})
	public Common(String browsr, String URL) throws IOException
	{
		this.browser=browsr;
		this.URL=URL;
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("browser  "+browsr);
		System.out.println("URL  "+URL);
	}
	
	 @Parameters({ "username","passwd"})
	 public void signin(WebDriver driver,String uname, String pwd) throws Throwable {
		      Common commom = null;
		      this.driver = driver;
		      System.out.println("Welcome");
		      hp = new HomePage(driver);
			  System.out.println("username"+uname);
			  System.out.println("password"+pwd);
			  hp.Clickonlink();
			  driver.findElement(By.id("email")).sendKeys(uname); //id = email
			  driver.findElement(By.id("pass")).sendKeys(pwd); //id = pass
			  Thread.sleep(7000);
			  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			  Thread.sleep(5000);
			  Assert.assertTrue(true);
			  Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),'Sign Out')])[1]")).isDisplayed(), "Post Login Page found"); 
	}
	 
	 public static String fromProperties(String fileName, String key) 
		{
			String value = null;
			try
			{
				File f = new File("./Test_Configuration/"+fileName+".properties");
				FileInputStream fis = new FileInputStream(f);
				// Step 3
				Properties prop = new Properties();
				prop.load(fis);
				value = (String) prop.get(key);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return value;
		}
	 /*public static String  BrowserInitiation(String URL,String browser)
	 {
		  System.out.println("URL ----   "+URL);
		  System.out.println("Browser ------  "+browser);
		  
		  if(URL.equals(Common.fromProperties("Configuration"," wilsonart_URL")))
		  //driver.get("https://www.wilsonart.com");
		  driver.get(Common.fromProperties("Configuration","wilsonart_URL"));
		  else if (URL.equals(Common.fromProperties("Configuration"," wilsonart_URL")))
		  //driver.get(Common.fromProperties("Configuration","polyrey_URL"));
		  Reporter.log("=====Application has Started======", true);
		  
		  }*/
	 }
/*	 public static WebElement getWebElement(String XpathLocator,String replacevalue,WebDriver driver)
		{
			WebElement element = null;
			XpathLocator=Element.replaceValue(XpathLocator, replacevalue);
			try
			{
				element= driver.findElement(By.xpath(XpathLocator));
				return element;
			}
			catch(Exception e)
			{
				Reporter.log("Unabale to find the Locator with Xpath" +XpathLocator ,true);
				return element;
			}
		} */
/*	public void CloseApplication() {
		  
		  driver.quit();
		  Reporter.log("======Browser Session Ended=======", true);
		    
	  }*/
    

