package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import generic.FrameworkConstants;
import generic.UtilityMethods;

public class BaseTest extends UtilityMethods {
	
WebDriver driver;
	
	@Parameters("browser") //browser name must be given at runtime
	@BeforeClass(alwaysRun = true)
	public void setUpBrowser(@Optional("chrome") String browserName) {
	
		if(browserName.contains("chrome")) {
			System.setProperty(FrameworkConstants.CHROME_KEY, FrameworkConstants.CHROME_PATH);
			driver=new ChromeDriver();
			
		} else if(browserName.contains("firefox")) {
			System.setProperty(FrameworkConstants.FIREFOX_KEY, FrameworkConstants.FIREFOX_PATH);
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser name not specified");
		}
		
		driver.manage().window().maximize();
		driver.get(FrameworkConstants.URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@AfterClass(alwaysRun = true)
	public void browserTearDown() {
		driver.quit();
	}

}
