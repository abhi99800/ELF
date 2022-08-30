package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Yogita
 *
 */

public class JSElibrary implements FrameworkConstants{
	
	
	JavascriptExecutor js;
	
	public JSElibrary(WebDriver driver) {
		
		js=(JavascriptExecutor)driver;
	}
	
	
	public void JSEClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	public void JSETF(WebElement element,String value) {
		
		js.executeScript("arguments[0].value='"+value+"';", element);
	}

}
