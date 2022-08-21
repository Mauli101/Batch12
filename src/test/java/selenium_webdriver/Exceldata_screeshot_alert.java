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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldata_screeshot_alert {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement txt_firstname =driver.findElement(By.xpath("(//input[@maxlength='60'])[1]"));
		WebElement txt_lastname =driver.findElement(By.xpath("(//input[@maxlength='60'])[2]"));
		WebElement txt_confirmpass =driver.findElement(By.xpath("(//input[@maxlength='60'])[7]"));
		WebElement txt_phone =driver.findElement(By.xpath("(//input[@maxlength='20'])[1]"));
		WebElement txt_email =driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement txt_address =driver.findElement(By.xpath("(//input[@maxlength='60'])[3]"));
		WebElement txt_city =driver.findElement(By.xpath("(//input[@maxlength='60'])[4]"));
		WebElement txt_postalcode =driver.findElement(By.xpath("(//input[@maxlength='20'])[2]"));
		WebElement txt_state =driver.findElement(By.xpath("//input[@name='state']"));
		WebElement txt_country =driver.findElement(By.xpath("//select[@name='country']"));
		WebElement txt_username =driver.findElement(By.xpath("(//input[@maxlength='60'])[5]"));
		WebElement txt_password =driver.findElement(By.xpath("(//input[@maxlength='60'])[6]"));
		WebElement btn_submit =driver.findElement(By.xpath("//input[@name='submit']"));
		
		
		String path = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\TestData\\testdata2.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		String data_firstname=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println();
		String data_lastname=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String data_phone=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String data_email=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String data_address=wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String data_city=wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		String data_postalcode=wb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
		String data_state=wb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
		String data_country=wb.getSheet("Sheet1").getRow(1).getCell(8).getStringCellValue();
		String data_username=wb.getSheet("Sheet1").getRow(1).getCell(9).getStringCellValue();
		String data_pass=wb.getSheet("Sheet1").getRow(1).getCell(10).getStringCellValue();
		String data_confirmpass=wb.getSheet("Sheet1").getRow(1).getCell(11).getStringCellValue();
		
	
		txt_firstname.sendKeys(data_firstname);
		txt_lastname.sendKeys(data_lastname);
		txt_phone.sendKeys(data_phone);
		txt_email.sendKeys(data_email);
		txt_address.sendKeys(data_address);
		txt_city.sendKeys(data_city);
		txt_postalcode.sendKeys(data_postalcode);
		txt_state.sendKeys(data_state);
		
		Select sc = new Select(txt_country);
		sc.selectByValue(data_country);
		
		txt_username.sendKeys(data_username);
		txt_password.sendKeys(data_pass);
		txt_confirmpass.sendKeys(data_confirmpass);	
		btn_submit.click();
		Thread.sleep(3000);
		
		String path2 = "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Screenshot";
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File file=ss.getScreenshotAs(OutputType.FILE);
		File dstn = new File(path2+ "//ssc.png");
		FileUtils.copyFile(file, dstn);

		String text = driver.getTitle();
		System.out.println(text);
		Thread.sleep(3000);
		
		WebElement btn_signin=driver.findElement(By.xpath("//a[text()=' sign-in ']"));
		btn_signin.click();
		Thread.sleep(3000);
		
		String text1= driver.getTitle();
		System.out.println(text1);
		
		File file2=ss.getScreenshotAs(OutputType.FILE);
		File dstn2 = new File(path2+"//ssc2.png");
		FileUtils.copyFile(file2, dstn2);
		
		WebElement txt_username2 =driver.findElement(By.xpath("(//input[@maxlength='60'])[1]"));
		WebElement txt_pass2 =driver.findElement(By.xpath("(//input[@maxlength='60'])[2]"));
		WebElement btn_submit2 =driver.findElement(By.xpath("//input[@name='submit']"));
		
		txt_username2.sendKeys(data_username);
		txt_pass2.sendKeys(data_pass);
		
		btn_submit2.click();
		Thread.sleep(3000);
		
		File ss3 = ss.getScreenshotAs(OutputType.FILE);
		File dstn3 = new File(path2+"//ssc3.png");
		FileUtils.copyFile(ss3, dstn3);
		
		
		
		
	}
}

