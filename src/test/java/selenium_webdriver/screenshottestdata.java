package selenium_webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshottestdata{
public static void main(String []args) throws Exception{

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement txt_username=driver.findElement(By.name("username"));
WebElement txt_pass = driver.findElement(By.name("pass"));
WebElement btn_login = driver.findElement(By.xpath("//button[text()='Log In']"));

String path ="C:\\Users\\dell\\eclipse-workspace\\Selenium\\TestData\\Testdata.xlsx";
FileInputStream fis= new FileInputStream(path);
XSSFWorkbook wb = new XSSFWorkbook (fis);
String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
String data_2 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

txt_username.sendKeys(data_1);
txt_pass.sendKeys(data_2);
btn_login.click();

TakesScreenshot sc = (TakesScreenshot)driver;
File src=sc.getScreenshotAs(OutputType.FILE);
String path2 = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Screenshot";
File dstn = new File(path+"shot.png");
FileUtils.copyFile(src,dstn);

driver.close();
}

}
