package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpaath {

	public static void main(String[] args) throws InterruptedException {
		// finding the element by xpath
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		username.sendKeys("Test@123");
		Thread.sleep(1000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Pass@123");
		Thread.sleep(5000);
		
		WebElement login_btn = driver.findElement(By.xpath("//*[@name='login']"));
		login_btn.click();
		Thread.sleep(5000);
		
		WebElement forgotpass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotpass.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
