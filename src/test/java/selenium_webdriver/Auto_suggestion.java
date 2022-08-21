package selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@title='Search']"));
		searchbar.sendKeys("Maven");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		System.out.println(list.size());
		
		for(int i = 0;i<=list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("maven dependency")) {
				list.get(i).click();
				break;
		
			}
		}
		
		
		
		
		
	}

}
