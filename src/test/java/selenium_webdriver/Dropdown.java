package selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement drp_select =driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel = new Select(drp_select);
		
		//select by value
		sel.selectByValue("INDIA");
		Thread.sleep(1000);
		
		// select by index
		sel.selectByIndex(4);
		Thread.sleep(1000);
		
		//select by visible text
		sel.selectByVisibleText("INDIA");

		// print the count of the options present in dropdown
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for	(int a =0;a<=list.size()-1;a++) {
			String text=list.get(a).getText();
			System.out.println(text);
			if(text.equals("BULGARIA")) {
				sel.selectByValue("BULGARIA");
				break;
			}
		}
	}
}
