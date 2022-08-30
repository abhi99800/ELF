package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "ico-login")
	WebElement loginLink;
	
	public void clickLogin() {
		loginLink.click();
	}
	
	@FindBy(className = "ico-register")
	WebElement registerLink;
	
	public void registerClick() {
		clickAction(registerLink);
	}
	
	@FindBy(linkText = "BOOKS")
	WebElement booksLink;
	
	
}
