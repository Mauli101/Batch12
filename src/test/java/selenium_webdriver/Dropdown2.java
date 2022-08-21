package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {
	
	
	public static void DropdownHandle(WebElement element, String value) {

		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}
	
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
		DropdownHandle(drp,"UNITED STATES");
		


		
		
		
	}

}
