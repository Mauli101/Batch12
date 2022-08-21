package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonanothertestcase {
	
	@Test() 
	public void test_1() {
		System.out.println("test case 1");
		Assert.assertTrue(false);
	}
	@Test (dependsOnMethods ="test_1"	)
	public void test_2() {
		System.out.println("test case 2");
	}
	@Test 
	public void test_3() {
		System.out.println("test case 3");
	}
	@Test 
	public void test_4() {
		System.out.println("test case 4");
	}

}
