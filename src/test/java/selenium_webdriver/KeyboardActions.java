package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(username,"devendra fandanavis").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
