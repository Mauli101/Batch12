package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown3 {
	
	public static void dropdown(WebElement element,String value ) {
		Select sel = new Select(element);
		
		sel.selectByVisibleText(value);
	}

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement crt_acc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		crt_acc.click();
		Thread.sleep(2000);

		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("Mauli");
		Thread.sleep(2000);
		
		WebElement sirname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sirname.sendKeys("Patil");
		Thread.sleep(2000);

		WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mob.sendKeys("4395947597");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("Password");
		Thread.sleep(2000);
		
		WebElement drp_date = driver.findElement(By.xpath("//select[@id='day']"));
		dropdown(drp_date,"15");
		Thread.sleep(2000);
		
		WebElement drp_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		dropdown(drp_month,"Oct");
		Thread.sleep(2000);
		
		WebElement drp_year = driver.findElement(By.xpath("//select[@id='year']"));
		dropdown(drp_year,"1996");
		Thread.sleep(2000);
		WebElement drp_gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		drp_gender.click();
		Thread.sleep(2000);
		
		WebElement btn_signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btn_signup.click();
		
		
		
		
		
		
		
	}

}
