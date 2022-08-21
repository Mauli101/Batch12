package selenium_webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel__data {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement txt_username=driver.findElement(By.id("email"));
		WebElement txt_pass = driver.findElement(By.id("pass"));
		
		String path = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\TestData\\Testdata.xlsx";

	FileInputStream	fis = new FileInputStream(path);
	XSSFWorkbook wb  = new XSSFWorkbook(fis);
	String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data_1);
	
	String data_2 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data_2);
	
	double data_3 = wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	String data_3_s =String.valueOf(data_3);
	System.out.println(data_3_s);
	
	txt_username.sendKeys(data_1);
	txt_pass.sendKeys(data_3_s);
	
	
	
	}

}
