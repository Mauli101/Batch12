package Test_Varify;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PomPage.LoginPom;

public class Test_2 extends BaseClass{
	
	@Test
	public void test_01() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getText_email().sendKeys("Maharashtra");
		login.getText_password().sendKeys("r76w8");
		login.getBtn_login().click();
		
	}

}
