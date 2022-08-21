package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_D_3 extends BaseClass {
	
	@Test
	public void test_1() throws Exception {
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement english = driver.findElement(By.xpath("//li[text()='English (UK)']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,500)", english);
	System.out.println("executed succesfully");
	
	Thread.sleep(4000);
	}

}
