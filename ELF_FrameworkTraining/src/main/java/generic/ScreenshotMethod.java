package generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod implements FrameworkConstants {
	static LocalDateTime date=LocalDateTime.now();
	static String systemDateTime=date.toString();

	public static void elementScreenshot(WebElement element) {

		File temp= element.getScreenshotAs(OutputType.FILE);
		File dest=new File(SCREENSHOT_PATH+systemDateTime+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	public static void pageScreenshot(WebDriver driver) {
		
		System.out.println(systemDateTime);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(SCREENSHOT_PATH+systemDateTime+".png");

		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
