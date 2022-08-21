package selenium_webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_window_handeling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement newwindow=driver.findElement(By.xpath("//a[text()='Click Here']"));
		newwindow.click();
		
		String parent_window=driver.getWindowHandle();
	
		Set<String> all_window =driver.getWindowHandles();
		
		Iterator<String> it =all_window.iterator();
		
		while(it.hasNext()) {
			String child_window= it.next();
		
		if(!parent_window.equals(child_window)) {
			driver.switchTo().window(child_window);
			
			WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
			email.sendKeys("rajababu");
			driver.close();
		}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent_window);
		driver.close();
	}
}
