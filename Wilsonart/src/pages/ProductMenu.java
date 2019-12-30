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

public class ProductMenu {
  
WebDriver driver;

public ProductMenu(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//a[contains(text(),'Products')]")
WebElement ProductMainMenu;

@FindBy(xpath="//li[@class='mega-menu us-en__inner-item mega-menu us-en__inner-item--level1 mega-menu us-en__inner-item--parent active']//a[@class='mega-menu us-en__inner-link'][contains(text(),'All Designs')]")
WebElement HLP_AllDesigns;

@FindBy(xpath="//a[@class='action showcart']//span[@class='text'][contains(text(),'My Cart')]")
WebElement MyCart;
  
@FindBy(xpath="//span[contains(text(),'View Cart')]")
WebElement ViewCart;

@FindBy(xpath="//td[@class='col item']//a[contains(text(),'ProductValue')]")
WebElement ProductName;

@FindBy(xpath="//a[@id='sample_order_1752']")
WebElement selectSampleProduct;

@FindBy(xpath="//select[@name='options[13878]'")
WebElement selectProductType;

@FindBy(xpath="//select[@id='Finish'")
WebElement selectProductFinish;

@FindBy(xpath="//select[id='Size'")
WebElement selectProductSize;

@FindBy(xpath="//select[@id='qty'")
WebElement selectProductQuantity;






 
public void productCheckout() throws InterruptedException
{
	Actions act = new Actions(driver);
	Action MouseOver = act.moveToElement(ProductMainMenu).build();
	MouseOver.perform();
	HLP_AllDesigns.click();
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	js.executeScript("window.scrollBy(0,200)");
	selectSampleProduct.click();
	Thread.sleep(2000);
	
	
	selectProductType.click();
	Select s = new Select(selectProductType);
	s.selectByIndex(0);
	Thread.sleep(3000);
	
	selectProductFinish.click();
	Select s1 = new Select(selectProductFinish);
	s1.selectByIndex(0);
	Thread.sleep(3000);
	
	selectProductSize.click();
	Select s2=new Select(selectProductSize);
	s2.selectByIndex(0);		
	Thread.sleep(3000);
	
	selectProductQuantity.click();
	Select s3 = new Select(selectProductQuantity);
	s2.selectByIndex(1);	
	
}




public void MyCart() throws InterruptedException
{
	Actions act = new Actions(driver);
	Action MouseOver = act.moveToElement(ProductMainMenu).build();
	MouseOver.perform();
	HLP_AllDesigns.click();
	Thread.sleep(5000);
	MyCart.click();
	ViewCart.click();
	//ProductName.findElement(By.xpath(xpathExpression))
}
	
}




