package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Baseclass;


public class Logpage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	
		@FindBy(name="user-name")
	    WebElement UserName;
	   
	    @FindBy(id="password")
	    WebElement Password;
	    
	    @FindBy(name="login-button")
	    WebElement Login;
	    
	    
	    
	public Logpage (){
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		
		PageFactory.initElements(driver, this);
		
	}
	public void login(String uname, String pass) {
		test = report.startTest("Login Test Case");
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(UserName));
		UserName.sendKeys(uname);
		test.log(LogStatus.PASS, "Successfully entered the user name");
		
		Password.sendKeys(pass);
		test.log(LogStatus.PASS, "Successfully entered the password");
		Login.click();
		test.log(LogStatus.PASS, "Successfully clicked on the Login link");

		
	}
			

}
