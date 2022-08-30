package generic;

import org.openqa.selenium.WebElement;

public class UtilityMethods implements FrameworkConstants {
	
	public void clickAction(WebElement element) {
		element.click();
	}
	public void enterValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	

}
