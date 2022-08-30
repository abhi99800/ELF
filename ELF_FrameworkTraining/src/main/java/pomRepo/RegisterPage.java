package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="gender-male")
	WebElement maleGender;
	
	public void clickMaleRadio() {
		clickAction(maleGender);
	}
	
	@FindBy (id = "gender-female")
	WebElement femaleGender;
	
	public void clickFemaleRadio() {
		clickAction(femaleGender);
	}
	
	@FindBy (id = "FirstName")
	WebElement FirstNameTF;
	
	public void enterFirstName(String firstName) {
		enterValue(FirstNameTF, firstName);
	}
	
	@FindBy(id = "LastName")
	WebElement LastNameTF;
	
	public void enterLastName(String lastName) {
		enterValue(LastNameTF, lastName);
	}
	
	@FindBy (id = "Email")
	WebElement emailTF;
	
	public void enterEmail(String email) {
		enterValue(emailTF, email);
	}
	
	@FindBy(id = "Password")
	WebElement passwordTF;
	
	public void enterPassword(String password) {
		enterValue(passwordTF, password);
	}
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordTF;
	
	public void enterConfirmPassword(String password) {
		enterValue(confirmPasswordTF, password);
	}
	
	@FindBy (id = "register-button")
	WebElement registerButton;
	
	public void clickRegisterButton() {
		clickAction(registerButton);
	}

}
