package Test_Varify;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import PomPage.LoginPom;

public class Test_1 extends BaseClass{
	
	@Test
	public void test_01() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getText_email().sendKeys("Maharashtra");
		login.getText_password().sendKeys("1398");
		login.getBtn_login().click();
	}

}
