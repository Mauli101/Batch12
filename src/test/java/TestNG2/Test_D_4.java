package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D_4  {
	
	@Test
	public void test_1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("//a[text()='मराठी']"));
		Thread.sleep(5000);
		element.click();
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(3000);	*/
		scrolling(driver,element);
		}
	public static void scrolling(WebDriver driver , WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
}