package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class element2 {

	public static void main(String[] args) throws InterruptedException {
// open browser and url
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// find webelements
	    WebElement username=driver.findElement(By.name("username"));
	    username.sendKeys("123456");
	    
	    WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("123456678");
	    
	    WebElement login=driver.findElement(By.className("qF0y9"));
	    login.click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(5000);
	    driver.close();
	    
	    
		
	}

}
