package selenium_webdriver;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class excelsheet {

	   public static void main(String[] args) throws Exception {
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	 
    WebElement name = driver.findElement(By.xpath("(//input[@maxlength='60'])[1]"));
    WebElement last_name = driver.findElement(By.xpath("(//input[@maxlength='60'])[2]"));
    WebElement addres = driver.findElement(By.xpath("(//input[@maxlength='60'])[3]"));
    WebElement city = driver.findElement(By.xpath("(//input[@maxlength='60'])[4]"));
    WebElement user_name = driver.findElement(By.xpath("(//input[@maxlength='60'])[5]"));
    WebElement password = driver.findElement(By.xpath("(//input[@maxlength='60'])[6]"));
    WebElement con_pass = driver.findElement(By.xpath("(//input[@maxlength='60'])[7]"));
    
    WebElement phone = driver.findElement(By.xpath("(//input[@maxlength='20'])[1]"));
    WebElement pos_cod = driver.findElement(By.xpath("(//input[@maxlength='20'])[2]"));
    WebElement email = driver.findElement(By.xpath("//input[@maxlength='64']"));
    WebElement state = driver.findElement(By.xpath("(//input[@maxlength='40'])[1]"));
    WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
    
String path="C:\\Users\\dell\\eclipse-workspace\\Selenium\\TestData\\testdata3.xlsx";
	
    FileInputStream Fis=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(Fis);
    Thread.sleep(5000);
    
    String name_d= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    String last_name_d= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
    String addres_d= wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
    String city_d= wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
    String user_name_d= wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
    String password_d= wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
    String con_pass_d= wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
    String phone_d= wb.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
    String pos_cod_d= wb.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
    String email_d= wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
    String state_d= wb.getSheet("Sheet1").getRow(0).getCell(10).getStringCellValue();
    String country_d= wb.getSheet("Sheet1").getRow(0).getCell(11).getStringCellValue();
    
    name.sendKeys(name_d);
    last_name.sendKeys(last_name_d);
    addres.sendKeys(addres_d);
    city.sendKeys(city_d);
    user_name.sendKeys( user_name_d);
    password.sendKeys(password_d);
    con_pass.sendKeys(con_pass_d);
    phone.sendKeys(phone_d);
    pos_cod.sendKeys(pos_cod_d);
    email.sendKeys(email_d);
    state.sendKeys(state_d);
    
    Select Sel=new Select(country);
    Sel.selectByVisibleText(country_d);
	   }
}