package testScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import pomRepo.RegisterPage;
import pomRepo.WelcomePage;

public class RegisterTest  extends BaseTest{
	
	@Test(dataProvider = "Register")
	public void registerTestCase(String gender,String FirstName, String LastName, String email, String password) {
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.registerClick();
		
		RegisterPage registerPage=new RegisterPage(driver);
		
		if(gender.contains("Female")) {
		    registerPage.clickFemaleRadio();
		}else if(gender.contains("Male")) {
			registerPage.clickMaleRadio();
		}
		registerPage.enterFirstName(FirstName);
		registerPage.enterLastName(LastName);
		registerPage.enterEmail(email);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(password);
		registerPage.clickRegisterButton();
		
		
	}
	
	@DataProvider(name = "Register")
	public Object[][] testData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		
			return lib.readMultipleData("Register");
		
		
	}
	
	

}
