package test;

import org.testng.annotations.Test;

import page.Logpage;
import page.Prodpage;
import page.Logpage;

public class Logtest extends Baseclass{
	
	
	@Test
	public void Login2()
	{
		Logpage Loginobj= new Logpage();
		Prodpage objProduct = new Prodpage();
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pass = sheet.getRow(1).getCell(1).getStringCellValue();
        String Product =sheet.getRow(1).getCell(2).getStringCellValue();
		Loginobj.login(uname, pass);
		objProduct.Selectprod(Product);
		objProduct.Gotocart();
	}
	
	

}
