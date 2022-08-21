package selenium_webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Excel_data_2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement txt_email=driver.findElement(By.id("email"));
		WebElement txt_pass =driver.findElement(By.id("pass"));
		WebElement btn_login = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		String path = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\TestData\\Testdata.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	    String data_1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data_1);
		
		String data_2 = wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data_2);
		
		/*String data_3 = wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data_3);*/
		
		txt_email.sendKeys(data_1);
		txt_pass.sendKeys(data_2);
		btn_login.click();
		 
        TakesScreenshot sc = (TakesScreenshot) driver;
        File ssc=sc.getScreenshotAs(OutputType.FILE);
        
        String path2 = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Screenshot";
        String rm = RandomString.make(3);
        
        File dstn = new File(path2 +"//"+rm+".png");
        
        FileUtils.copyFile(ssc, dstn);
        
		
		driver.close();
		
		
		
		
		
		
	}

}
