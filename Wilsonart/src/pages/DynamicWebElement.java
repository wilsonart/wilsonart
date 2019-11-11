package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DynamicWebElement {
	public static WebDriver driver;
	
	public DynamicWebElement(WebDriver driver) {
		
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement getWebElement(String XpathLocator,String replacevalue,WebDriver driver)
	{
		WebElement element = null;
		XpathLocator=DynamicWebElement.replaceValue(XpathLocator, replacevalue);
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
	}
	public static String replaceValue(String name, String value)
	{
		return name.replace("replace", value);
}

}
