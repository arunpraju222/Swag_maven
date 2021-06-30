package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class Prodpage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addcart;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement gotoCart;
	
	public Prodpage (){
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		
		PageFactory.initElements(driver, this);
		
	}
	public void Selectprod(String Product) {
		
		WebElement btnProductSelect = driver.findElement(By.xpath("//*[text()=\'"+ Product +"\']//following::button[1]"));
		btnProductSelect.click();
		
	}
	public void Gotocart() {
		gotoCart.click();
		
	}

}
