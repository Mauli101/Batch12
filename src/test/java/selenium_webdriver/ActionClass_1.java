package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//MoveTowdadrs element and click on it
		WebElement sele=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		act.moveToElement(sele).build().perform();
		Thread.sleep(3000);
		
		//Right click on element on webpage
		WebElement clk=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(clk).build().perform();
		Thread.sleep(3000);
		
		//Double click on webpage
		WebElement doub=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doub).build().perform();
		Thread.sleep(4000);
		
		//driver.close;
	}
}
