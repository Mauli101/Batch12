package TestNG;

import org.testng.annotations.Test;

public class invocationcount extends BaseTest {

	@Test
	public void test_1() {
		System.out.println("test_1");
	}
	@Test(invocationCount=4)
	public void test_2() {
		System.out.println("test_2");
	}
	@Test
	public void test_3() {
		System.out.println("test_3");
	}
	@Test
	public void test_4() {
		System.out.println("test_4");
	}
	
}
