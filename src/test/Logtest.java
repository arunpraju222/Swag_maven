package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.Cartpage;
import page.Logpage;
import page.Prodpage;
import page.Logpage;

public class Logtest extends Baseclass{
	public static WebDriver driver;
	
	@Test
	public void Login2()
	{
		Logpage Loginobj= new Logpage();
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		Loginobj.login(uname, pass);
		
	}
	
	@Test(dependsOnMethods="Login2")
	public void addtocart()
	{
		Prodpage productPageObj = new Prodpage();
		String product = sheet.getRow(1).getCell(2).getStringCellValue();
		productPageObj.Selectprod(product);
		
	}
	
	@Test(dependsOnMethods="addtocart")
	public void cart()
	{
		Cartpage cartPageObj = new Cartpage();
		String product = sheet.getRow(1).getCell(2).getStringCellValue();
		cartPageObj.verifyProduct(product);
		
	}

}
