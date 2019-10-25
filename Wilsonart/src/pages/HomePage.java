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
import org.openqa.selenium.support.ui.Select;
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

@FindBy(xpath=".//button[@id='adv_button']")
WebElement FindYourSearch;

@FindBy(xpath="//input[@id='search']")
WebElement SearchBox;

@FindBy(xpath="(//button[@type='submit'])[1]")
WebElement SearchButton;

@FindBy(xpath="(//a[contains(text(),'Products')])[1]")
WebElement Products;

@FindBy(xpath="(//a[contains(text(),'Register')])[1]")
WebElement Register;

@FindBy(xpath="//select[@id='prefix']")
WebElement Prefix_Selectbox;

@FindBy(xpath="//input[@id='firstname']")
WebElement FirstName;

@FindBy(xpath="//input[@id='lastname']")
WebElement LastName;

@FindBy(xpath="//input[@id='company']")
WebElement Company_bx;

@FindBy(xpath="//input[@id='title']")
WebElement Title;

@FindBy(xpath="//input[@id='email_address']")
WebElement Email_address;

@FindBy(xpath="//input[@id='password']")
WebElement Password ;

@FindBy(xpath="//input[@id='password-confirmation']")
WebElement Confirm_Password;

@FindBy(xpath=".//button[@type='submit' and @title='Create an Account']")
WebElement Create_Account;

@FindBy(xpath=".//input[@id='category_option_22']")
WebElement Checkbox_Quartz;

@FindBy(xpath=".//input[@id='design_group_15']")
WebElement Designgroup_Medium;


@FindBy(xpath=".//input[@id='color_group_25']")
WebElement Colorgroup_BlackGrey;

@FindBy(xpath=".//button[@name='advance_search_reset']")
WebElement adv_search_reset;

@FindBy(xpath=".//button[@id='search-btn']")
WebElement adv_searchbtn;
		
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
				
	/*WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Find Your Surface')]")));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	Thread.sleep(20000);*/
	FindYourSearch.click();
	
}

public void HovertoProducts()
{
	Actions action = new Actions(driver);
	action.moveToElement(Products).build().perform();
}

public void ClickonRegister()
{
	Register.click();
}

public void SelectPrefix(int index)
{
	
	Select prefix=new Select(Prefix_Selectbox);
	prefix.selectByIndex(index);
	
}




public void FilltheForm(String Fname, String Lname, String Company, String Email, String Passwd)
{
	FirstName.sendKeys(Fname);
	LastName.sendKeys(Lname);
	Company_bx.sendKeys(Company);
	Email_address.sendKeys(Email);
	Password.sendKeys(Passwd);
	Confirm_Password.sendKeys(Passwd);
	
}

public void click_CreateAccount()
{
	Create_Account.click();
}

public void advance_search() throws Exception
{
	
	Thread.sleep(5000);
	adv_searchbtn.click();
	Thread.sleep(4000);
	FindYourSearch.click();
	Thread.sleep(2000);
	Checkbox_Quartz.click();
	Thread.sleep(1000);
	Designgroup_Medium.click();
	Thread.sleep(1000);
	Colorgroup_BlackGrey.click();
	Thread.sleep(1000);
	adv_search_reset.click();
	Thread.sleep(1000);
	Checkbox_Quartz.click();
	Thread.sleep(1000);
	Designgroup_Medium.click();
	Thread.sleep(1000);
	Colorgroup_BlackGrey.click();
	Thread.sleep(1000);
	adv_searchbtn.click();
	Thread.sleep(1000);
}

}
