package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PDP_Page {
  
WebDriver driver;

public PDP_Page(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//a[@class='mega-menu us-en__link'][contains(text(),'Products')]")
WebElement ProductMainMenu;
@FindBy(xpath="//li[@class='mega-menu us-en__inner-item mega-menu us-en__inner-item--level1 mega-menu us-en__inner-item--parent active']//a[@class='mega-menu us-en__inner-link'][contains(text(),'All Designs')]")
WebElement HLP_AllDesigns;



public void productCheckout() throws InterruptedException
{
	
	
	Actions act = new Actions(driver);
	Action MouseOver = act.moveToElement(ProductMainMenu).build();
	MouseOver.perform();
	HLP_AllDesigns.click();
	Thread.sleep(5000);
	
	}
	
}




