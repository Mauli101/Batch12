package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		WebElement btn_crtnewacc=driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		btn_crtnewacc.click();
		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("Raj");
		
		WebElement sirname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sirname.sendKeys("patil");
		
		WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mob.sendKeys("998383883");
		
		WebElement pass = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
		pass.sendKeys("passsss");

	}

}
