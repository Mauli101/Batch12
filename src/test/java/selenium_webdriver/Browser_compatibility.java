package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_compatibility {

	public static void main(String[] args) throws InterruptedException  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.getTitle();
		String Title=driver.getTitle();
		System.out.println(Title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close()
		
		;
		
		
		
		

	
		
	}

}
