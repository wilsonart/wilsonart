package tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;



public class BaseClass {
  
	WebDriver driver;
	public String browser;
	public String URL;
	
  @SuppressWarnings("deprecation")
  @Parameters({ "browser"})	
  @BeforeClass
  public void SetupApplication(String browser) {
	
	  Reporter.log("=====Browser Session Started=====", true);
	  Reporter.log("browser is "+browser);
	  	   
	  if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/chromedriver.exe");
	      driver = new ChromeDriver();
		  System.out.println("browser--"+browser);
	  }
	  else if (browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/geckodriver.exe");
		  DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		  capabilities.setCapability("marionette", true);
		  driver = new FirefoxDriver(capabilities); 
	      
	  }
	  else if (browser.equals("ie"))
	  {
		  System.setProperty("webdriver.ie.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/IEDriverServer.exe");
		  DesiredCapabilities iecapabilities=DesiredCapabilities.internetExplorer();
		  iecapabilities.setCapability("nativeEvents", false);
		  iecapabilities.setCapability("unexpectedAlertBehaviour", "accept");
		  iecapabilities.setCapability("ignoreProtectedModeSettings", true);
		  iecapabilities.setCapability("disable-popup-blocking", true);
		  iecapabilities.setCapability("enablePersistentHover", true);
		  iecapabilities.setCapability("ignoreZoomSetting", true);
		  iecapabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		  iecapabilities.setCapability("EnsureCleanSession", true);
		  driver = new InternetExplorerDriver(iecapabilities);
		  
		 
	  }
	  else if (browser.equals("mobile"))
	  {
		  Map<String, String> mobileEmulation = new HashMap<String, String>();
		  mobileEmulation.put("deviceName", "iPhone X");
		  Map<String, Object> chromeOptions = new HashMap<String, Object>();
		  chromeOptions.put("mobileEmulation", mobileEmulation); 
		  //ChromeOptions chromeOptions = new ChromeOptions();
          DesiredCapabilities capabilities = DesiredCapabilities.chrome();
          capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
          System.setProperty("webdriver.chrome.driver", "C:/Users/vp00465875/git/wilsonart/Wilsonart/Driver/chromedriver.exe");
		  driver = new ChromeDriver(capabilities);
		 		  
	  }
	  	  
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
	  Reporter.log("======Browser Session Ended=======", true);
	    
  }

}
