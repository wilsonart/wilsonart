package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
  
WebDriver driver;

public HomePage(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="(//*[contains(text(),'Sign In')])[1]")
WebElement SignIn;

@FindBy(xpath="//span[contains(text(), 'Find Your Surface')]")
WebElement FindYourSearch;

@FindBy(xpath="//input[@id='search']")
WebElement SearchBox;

@FindBy(xpath="(//button[@type='submit'])[1]")
WebElement SearchButton;

@FindBy(xpath="(//a[contains(text(),'Products')])[1]")
WebElement Products;


public void ClickonFindyourSearch()
{
	System.out.println("Method...");
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", FindYourSearch);
	
	//FindYourSearch.click();
	
	//FindYourSearch.sendKeys(Keys.RETURN);
	
	Actions builder = new Actions(driver);
    builder.moveToElement(FindYourSearch).click().build().perform();;
    
    
 }

public void entersearchkey(String finish)
{
	SearchBox.sendKeys(finish);
}

public void Clickonsearchbutton()
{
	SearchButton.click();
}

public void Clickonlink()
{
	SignIn.click();
}


public void presstab() throws Exception
{
				
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Find Your Surface')]")));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	Thread.sleep(20000);
}

public void HovertoProducts()
{
	Actions action = new Actions(driver);
	action.moveToElement(Products).build().perform();
}



}
