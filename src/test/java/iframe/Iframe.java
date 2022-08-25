package iframe;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
	@Test
public void iframe() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/dell/Documents/iframe.html");
	driver.manage().window().maximize();
	
	//WebElement element =driver.findElement(By.xpath("//button[@data-toggle='collapse']"));
	
	//driver.switchTo().frame(element);
	WebElement  element = driver.findElement(By.xpath("//iframe[@name='Selenium']"));
	
	driver.switchTo().frame(element);
	WebElement element2 =driver.findElement(By.xpath("//button[@data-toggle='collapse']"));
	element2.click();
	
	driver.switchTo().defaultContent();
	
	WebElement maven = driver.findElement(By.xpath("//iframe[@name='MVN']"));
	driver.switchTo().frame(maven);
	
	WebElement elementmaven=driver.findElement(By.xpath("//a[text()='Contact Us']"));
	elementmaven.click();
	
	driver.switchTo().defaultContent();
	
	WebElement facebook=driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']"));
	facebook.click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.close();
	}

}
