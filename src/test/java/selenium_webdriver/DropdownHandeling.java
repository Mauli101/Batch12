package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandeling {
	
	public static void dropdown(WebElement element , String value) {
			Select sc = new Select(element);
			sc.selectByVisibleText(value);
	}

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btn_crtnewacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btn_crtnewacc.click();
		Thread.sleep(3000);
		
		WebElement drp_date = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement drp_month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement drp_year = driver.findElement(By.xpath("//select[@id='year']"));
		
		dropdown(drp_date,"10");
		dropdown(drp_month,"Apr");
		dropdown(drp_year,"2020");
	}

}
