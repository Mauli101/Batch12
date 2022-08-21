package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_1 extends BaseTest {

	@Test
	public void test_1() {
		WebElement email= driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		email.sendKeys("mark");
		pass.sendKeys("zukerberg");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void test_2() {
		WebElement login =driver.findElement(By.name("login"));
		login.click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
