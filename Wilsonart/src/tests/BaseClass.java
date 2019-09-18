package tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;



public class BaseClass {
  
	WebDriver driver;
	public String browser;
	public String URL;
	
  @Parameters({ "browser"})	
  @BeforeClass
  public void SetupApplication(String browser) {
	
	  Reporter.log("=====Browser Session Started=====", true);
	  Reporter.log("browser is "+browser);
	  System.setProperty("webdriver.chrome.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/chromedriver.exe");
      driver=new ChromeDriver();
	  System.out.println("browser--"+browser);
	   
	  /*switch(browser)
	     {
		  case "chrome":
		  {
			  System.setProperty("webdriver.chrome.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/chromedriver.exe");
	          driver=new ChromeDriver();
			  System.out.println("browser--"+browser);
		  }
		  
		  case "firefox":
		  {
			 System.setProperty("webdriver.gecko.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/geckodriver.exe");
	         driver=new FirefoxDriver();
		  }
		  
		  case "ie":
		  {
			  System.setProperty("webdriver.edge.driver","C:/Users/vp00465875/workspace/Wilsonart/Driver/MicrosoftWebDriver.exe");
			  driver = new EdgeDriver();
		  }
		  
		  default:
		  {
			  System.out.println("---Please mention the Browser---");
		  }
	  }*/
	  	  	  
	  driver.manage().window().maximize();
	  
	  System.out.println("URL ----   "+URL);
	  System.out.println("Browser ------  "+browser);
	  
	  if(URL.equals("wilsonart"))
	  driver.get("https://www.wilsonart.com");
	  else if (URL.equals("polyrey"))
	  driver.get("https://www.polyrey.com");  
	  Reporter.log("=====Application has Started======", true);
	  
	  }

  @AfterClass
  public void CloseApplication() {
	  
	  driver.quit();
	  Reporter.log("======Browser Session End=======", true);
	    
  }

}
