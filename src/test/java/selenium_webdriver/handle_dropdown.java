package selenium_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle_dropdown{
	
	public static void dropdown(WebElement element ,String value ){
		Select sc = new Select (element );
		sc.selectByValue(value);
		
	}
public static void main(String []args) throws Exception{
	
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();

WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));

dropdown(drp,"INDIA");
Thread.sleep(50000);


Select sc = new Select(drp);
sc.selectByValue("UNITED STATES");

sc.selectByIndex(3);
sc.selectByVisibleText("UNITED KINGDOM");
List <WebElement> list= sc.getOptions();
System.out.println(list.size());

for(int a = 0;a<=list.size();a++){
String text = list.get(a).getText();
if(text=="INDIA"){
sc.selectByValue("INDIA");

break;
}
}

}

}