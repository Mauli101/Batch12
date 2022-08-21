package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	//softassert : it is a soft assert object class 
	// it does not abort the execution after assert fail 
	// need to call AssertAll() to find the the assert failure

	@Test
	public void test_1() {
		System.out.println("email");
		System.out.println("password");
		System.out.println("login");
		SoftAssert ast = new SoftAssert();
		String actual = "log in";
		String expected ="Log In";
		ast.assertEquals(actual, expected);
		System.out.println("navigated to home page");
		ast.assertAll();
	}
	@Test 
	public void test_2() {
		System.out.println("test  2");
	}
}
