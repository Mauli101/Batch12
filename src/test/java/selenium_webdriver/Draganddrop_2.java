package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop_2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement txt_username =driver.findElement(By.id("email"));
		WebElement crt_page = driver.findElement(By.xpath("//a[text()='Create a Page']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(crt_page, txt_username).build().perform();
		
		
		

	}

}
