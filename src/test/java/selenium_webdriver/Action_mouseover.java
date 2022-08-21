package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_mouseover {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover_html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement mouseover=driver.findElement(By.xpath("//h1[@onmouseover='mouseOver()']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseover).click().build().perform();
	}

}
