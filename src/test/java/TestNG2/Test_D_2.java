package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_D_2 extends BaseClass{
	
	@Test
	public void test_1() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");

		Thread.sleep(5000);
		
	}

}
