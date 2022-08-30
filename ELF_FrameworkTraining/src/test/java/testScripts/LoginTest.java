package testScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import pomRepo.LoginPage;
import pomRepo.WelcomePage;

public class LoginTest extends BaseTest{
	
	@Test(dataProvider = "Login")
	public void testCase1(String username, String Password) {
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickLogin();
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(username);
		loginPage.enterPassword(Password);
	}
	
	@DataProvider (name = "Login")
	public Object[][] testData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		
		return lib.readMultipleData("Login");
		
	}

}
