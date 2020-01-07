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
WebElement btn_MyCart;
  
@FindBy(xpath="//span[contains(text(),'View Cart')]")
WebElement btn_ViewCart;

@FindBy(xpath="//td[@class='col item']//a[contains(text(),'ProductValue')]")
WebElement ProductName;

@FindBy(xpath="//a[@id='sample_order_6146']")
WebElement selectSampleProduct;

@FindBy(xpath="//div[@class='control']/select[@name='options[7145]']")
WebElement selectProductType;

@FindBy(xpath="//select[@name='options[7144]']")
WebElement selectProductFinish;

@FindBy(xpath="//select[@id='qty_6146']")
WebElement selectProductQuantity;

@FindBy(xpath="//span[contains(text(),'Order')]")
WebElement btn_Order;

@FindBy(xpath="//button[@onclick='popupTrigger()']")
WebElement btn_CheckOut;

@FindBy(xpath="//button[@class='iwd_opc_button active iwd_opc_place_order_button']//span[contains(text(),'Place Order')]")
WebElement btn_PlaceOrder;

public void productCheckout() throws InterruptedException
{
	Actions act = new Actions(driver);
	Action MouseOver = act.moveToElement(ProductMainMenu).build();
	MouseOver.perform();
	HLP_AllDesigns.click();
	Thread.sleep(5000);
	selectSampleProduct.click();
	Thread.sleep(2000);
	Select s = new Select(selectProductType);
	s.selectByVisibleText("Standard Laminate");
	Select s2 = new Select(selectProductQuantity);
	s2.selectByVisibleText("2");
	btn_Order.click();
	Thread.sleep(5000);
	btn_CheckOut.click();
	Thread.sleep(10000);
	btn_PlaceOrder.click();	
	
}


public void MyCart() throws InterruptedException
{
	Actions act = new Actions(driver);
	Action MouseOver = act.moveToElement(ProductMainMenu).build();
	MouseOver.perform();
	HLP_AllDesigns.click();
	Thread.sleep(5000);
	selectSampleProduct.click();
	Thread.sleep(2000);
	Select s = new Select(selectProductType);
	s.selectByVisibleText("Standard Laminate");
	Select s2 = new Select(selectProductQuantity);
	s2.selectByVisibleText("2");
	btn_Order.click();
	Thread.sleep(2000);
	btn_MyCart.click();
	btn_ViewCart.click();
	//ProductName.findElement(By.xpath(xpathExpression))
}
	
}




