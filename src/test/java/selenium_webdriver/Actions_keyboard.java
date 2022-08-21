package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_keyboard {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_login=driver.findElement(By.xpath("//input[@name='email']"));
		Actions act = new Actions(driver);
		act.keyDown(txt_login,Keys.SHIFT).sendKeys("mauli").keyUp(Keys.SHIFT).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
	}

}
