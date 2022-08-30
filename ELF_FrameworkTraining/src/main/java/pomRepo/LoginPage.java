package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement emailTF;
	

	public void enterEmail(String email) {
		
	}
	
	@FindBy(id = "Password")
	WebElement passwordTF;
	
	public void enterPassword(String pwd) {
		passwordTF.sendKeys(pwd);
	}
	

}
