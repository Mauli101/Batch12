package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	// Assert : it allows us to verify the result of an operation 
	//its a hard assert class object  which stops the execution of next step if failed
	@Test
	public void test_1() {
		System.out.println("email id");
		System.out.println("password ");
		System.out.println("login");
		String actual = "Log In";
		String expected ="log in";
		Assert.assertEquals(actual, expected);
		System.out.println("home page");
	}
	@Test
	public void test_2() {
		System.out.println("test_2");
	}

}
