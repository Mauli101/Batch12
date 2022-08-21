import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txt_username=driver.findElement(By.name("username"));
		txt_username.sendKeys("cristiano");
		
		WebElement txt_pass = driver.findElement(By.name("password"));
		txt_pass.sendKeys("wdfj7937");
		
		WebElement btn_login= driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File ssc=sc.getScreenshotAs(OutputType.FILE);
		
		String path = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Screenshot";
		
		File dstn = new File(path+"//screenshot.png");
		FileUtils.copyFile(ssc, dstn);
		driver.close();
		
	}

}
