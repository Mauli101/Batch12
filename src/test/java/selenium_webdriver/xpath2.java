package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@name='text']"));
		username.sendKeys("Mau@li");
		Thread.sleep(1000);

		WebElement nxt = driver.findElement(By.xpath("//div[@style=\"color: rgb(255, 255, 255);\"]"));
		nxt.click();
		Thread.sleep(2000);

		WebElement forgotpass = driver.findElement(By.xpath("//span[text()='Forgot password?']"));
		forgotpass.click();
		Thread.sleep(2000);
		
		WebElement mail = driver.findElement(By.xpath("//input[@autocapitalize=\"none\"]"));
		mail.sendKeys("Mauli");
		Thread.sleep(3000);
		
		WebElement search= driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
		Thread.sleep(3000);
		
		WebElement in = driver.findElement(By.xpath("//input[@autocapitalize=\"none\"]"));
		in.sendKeys("maulig");
		Thread.sleep(3000);

		WebElement search2 = driver.findElement(By.xpath("//span[text()='Next']"));
		search2.click();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(1000);
		in.sendKeys("maulig");
		search2.click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		in.sendKeys("maulig");

		search2.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
