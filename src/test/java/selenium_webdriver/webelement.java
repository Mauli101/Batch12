package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement text_id= driver.findElement(By.id("email"));
		text_id.sendKeys("Mauli@Mauli");
		WebElement text_pass = driver.findElement(By.id("pass"));
		text_pass.sendKeys("Mauli@M");
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

		
		
	
		
		
		
	}

}
