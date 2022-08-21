package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
    
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action = new Actions (driver);
	action.contextClick(right_click).perform();
	Thread.sleep(2000);

	
	WebElement doub_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	action.doubleClick(doub_click).build().perform();
	}

}
