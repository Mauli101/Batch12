package selenium_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_handeling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement txt_accountno =driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement btn_submit = driver.findElement(By.name("submit"));
		txt_accountno.sendKeys("279479479");
		
		btn_submit.click();
		
		Alert alt =driver.switchTo().alert();
	    String text = alt.getText();
	    System.out.println(text);
		alt.accept();
		
		String text2 = alt.getText();
		System.out.println(text2);
		alt.accept();
		driver.close();
	}
}
