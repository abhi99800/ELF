package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownsTest  extends BaseTest{
	
	@Test
	public void dropdown() {
     driver.findElement(By.partialLinkText("BOOKS")).click();
		
		/* driver.findElement(By.xpath("//option[text()='List']")).click(); */
		
		
		WebElement SortByDD= driver.findElement(By.id("products-orderby"));
		Select sel=new Select(SortByDD);
		sel.selectByVisibleText("Name: Z to A");
		Boolean flag=sel.isMultiple();
		System.out.println(flag);
		sel.deselectByVisibleText("Name: Z to A");
	}

}
