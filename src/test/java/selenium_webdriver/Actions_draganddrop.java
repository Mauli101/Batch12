package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_draganddrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dstn= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src, dstn).build().perform();
		Thread.sleep(2000);
		 
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dstn2= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src2, dstn2).build().perform();
		Thread.sleep(2000);
		
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dstn3= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src3, dstn3).build().perform();
		
		WebElement src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dstn4= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src4, dstn4).build().perform();
	}

}
