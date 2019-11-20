package pages;

import java.util.Random;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
  
WebDriver driver;
DynamicWebElement dw;

public HomePage(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="(//*[contains(text(),'Sign In')])[1]")
WebElement SignIn;

@FindBy(xpath="//span[contains(text(),'Login')]")
WebElement Login;

@FindBy(xpath="//*[contains(text(),'Sign Out')])[1]")
WebElement SignOut;

@FindBy(xpath="//span[@class='after-login']")
WebElement AfterLogin;

public String validateAfterLogin = "(//span[@class='after-login'])[replace]";


//public String txtMailSubject = "(//div[@id='divSubject'][text()='New Survey Notification'])[replace]";


@FindBy(xpath="//span[contains(text(),'Hello, venkatram!')]")
WebElement LoggedInUser;

//div[@class='panel header']//span[@class='after-login'][contains(text(),'Hello, venkatram!')]  


@FindBy(xpath=".//button[@id='adv_button']")
WebElement FindYourSearch;

@FindBy(xpath="//input[@id='search']")
WebElement SearchBox;

@FindBy(xpath="(//button[@type='submit'])[1]")
WebElement SearchButton;

@FindBy(xpath="(//a[contains(text(),'Products')])[1]")
WebElement Products;

@FindBy(xpath="//a[contains(text(),'Register')]")
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

@FindBy(xpath="//input[@id='email_address_create']")
WebElement Email_address;

@FindBy(xpath="//input[@id='password-social']")
WebElement Password ;

@FindBy(xpath="//input[@id='password-confirmation']")
WebElement Confirm_Password;

@FindBy(xpath="//select[@name='group_id']")
WebElement Select_GroupID;


@FindBy(xpath="//button[@id='button-create-social']//span[contains(text(),'Create an Account')]")
WebElement Create_Account;

@FindBy(xpath="//input[@id='social_login_email']")
WebElement username;

@FindBy(xpath="//input[@id='social_login_pass']")
WebElement password;


/*@FindBy(xpath=".//input[@id='category_option_22']")
WebElement Checkbox_Quartz;

@FindBy(xpath=".//input[@id='design_group_15']")
WebElement Designgroup_Medium;


@FindBy(xpath=".//input[@id='color_group_25']")
WebElement Colorgroup_BlackGrey;

@FindBy(xpath=".//button[@name='advance_search_reset']")
WebElement adv_search_reset;*/

@FindBy(xpath="//div[@class='fys_buttons']/button[@name='advance_search_submit']")
WebElement adv_searchbtn;


//Find Your Surface Search

//Category

@FindBy(xpath="//input[@id='category_option_3']")
WebElement ChkBox_HLP;

@FindBy(xpath="//input[@id='category_option_22']")
WebElement ChkBox_Quartz;

@FindBy(xpath="//input[@id='category_option_49']")
WebElement ChkBox_SolidSurface;

@FindBy(xpath="//input[@id='category_option_10']")
WebElement ChkBox_DecorativeMetals;

@FindBy(xpath="//input[@id='category_option_825']")
WebElement ChkBox_ThinScapePerformanceTops;

@FindBy(xpath="//input[@id='category_option_858']")
WebElement ChkBox_BackSplash;

//Design Group

@FindBy(xpath="//input[@id='design_group_676']")
WebElement ChkBox_DesignGroup_Abstract;

@FindBy(xpath="//input[@id='design_group_1127']")
WebElement ChkBox_DesignGroup_Brown;

@FindBy(xpath="//input[@id='design_group_614']")
WebElement ChkBox_DesignGroup_Graphic;

@FindBy(xpath="//input[@id='design_group_1135']")
WebElement ChkBox_DesignGroup_Graphics;

@FindBy(xpath="//input[@id='design_group_1277']")
WebElement ChkBox_DesignGroup_TraceLess;

@FindBy(xpath="//input[@id='design_group_19']")
WebElement ChkBox_DesignGroup_Solids;

//Color Group

@FindBy(xpath="//input[@id='color_group_674']")
WebElement ChkBox_ColorGroup_AmberGold;

@FindBy(xpath="//input[@id='color_group_24']")
WebElement ChkBox_ColorGroup_AmberOrange;

@FindBy(xpath="//input[@id='color_group_25']")
WebElement ChkBox_ColorGroup_BlackGrey;

@FindBy(xpath="//input[@id='color_group_23'] ")
WebElement ChkBox_ColorGroup_YellowGold;

@FindBy(xpath="//input[@id='color_group_34']")
WebElement ChkBox_ColorGroup_White;

@FindBy(xpath="//input[@id='color_group_27']")
WebElement ChkBox_ColorGroup_Brown;

@FindBy(xpath="//input[@id='color_group_32']")
WebElement ChkBox_ColorGroup_Red;

@FindBy(xpath="//input[@id='color_group_31']")
WebElement ChkBox_ColorGroup_Purple;

@FindBy(xpath="//input[@id='color_group_26']")
WebElement ChkBox_ColorGroup_Blue;

@FindBy(xpath="//input[@id='color_group_28']")
WebElement ChkBox_ColorGroup_Green;

@FindBy(xpath="//input[@id='color_group_1131']")
WebElement ChkBox_ColorGroup_Grey;

@FindBy(xpath="//input[@id='color_group_1119']")
WebElement ChkBox_ColorGroup_Black;





		
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

public void entersearchkey(String Value)
{
	SearchBox.sendKeys(Value);
}

public void Clickonsearchbutton()
{
	SearchButton.click();
}

public void Clickonlink()
{
	SignIn.click();
}

public void SignInToApplication(String uname, String pwd,String Expected) throws InterruptedException
{
	dw = new DynamicWebElement(driver);
	username.sendKeys(uname);
	password.sendKeys(pwd);
	Login.click();
	Thread.sleep(10000);
	String Actual = AfterLogin.getText();
	System.out.println(Actual);	
}

/*public void presstab() throws Exception
{
				
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Find Your Surface')]")));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	Thread.sleep(20000);
	FindYourSearch.click();
	
}*/

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




public void UserRegistration(String Email, String Passwd) throws Throwable
{
	Thread.sleep(5000);
	Register.click();
	Thread.sleep(5000);
	Random ran = new Random();
	String Value = Email+ran.nextInt(1000)+"@gmail.com";
	Email_address.sendKeys(Value);
	Password.sendKeys(Passwd);
	Select S = new Select(Select_GroupID);
	S.selectByVisibleText(Common.fromProperties("Configuration", "GroupID"));
	Create_Account.click();
	Thread.sleep(10000);
	String Original = AfterLogin.getText();
	System.out.println(Original);
	Assert.assertEquals(AfterLogin.getText(), "Hello, .!");
}

public void advance_search() throws Exception
{
	FindYourSearch.click();	
	Thread.sleep(5000);
	
	//Category
	
	ChkBox_HLP.click();
/*	Thread.sleep(5000);
	ChkBox_Quartz.click();
	Thread.sleep(5000);
	ChkBox_SolidSurface.click();
	Thread.sleep(5000);
	ChkBox_DecorativeMetals.click();
	Thread.sleep(5000);
	ChkBox_ThinScapePerformanceTops.click();
	Thread.sleep(5000);
	ChkBox_BackSplash.click();*/
	Thread.sleep(5000);
	
	//Design Group
	
	ChkBox_DesignGroup_Abstract.click();
/*	Thread.sleep(5000);
	ChkBox_DesignGroup_Brown.click();
	Thread.sleep(5000);
	ChkBox_DesignGroup_Graphic.click();
	Thread.sleep(5000);
	ChkBox_DesignGroup_Graphics.click();
	Thread.sleep(5000);
	ChkBox_DesignGroup_TraceLess.click();
	Thread.sleep(5000);
	ChkBox_DesignGroup_Solids.click();*/
	Thread.sleep(5000);
	
	//Color Group
	ChkBox_ColorGroup_AmberGold.click();
	Thread.sleep(5000);
/*	ChkBox_ColorGroup_AmberOrange.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_BlackGrey.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_YellowGold.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_White.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Brown.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Red.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Purple.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Blue.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Green.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Grey.click();
	Thread.sleep(5000);
	ChkBox_ColorGroup_Black.click();
	Thread.sleep(5000);*/
	
	adv_searchbtn.click();
}	
	
	
/*	adv_searchbtn.click();
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
	Thread.sleep(1000);*/
	
	





}
