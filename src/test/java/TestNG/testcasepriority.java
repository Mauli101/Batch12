package TestNG;

import org.testng.annotations.Test;

public class testcasepriority {
	@Test(priority=3)
public void test_1() {
	System.out.println("test_1");
}
	@Test(priority=4)
public void test_2() {
	System.out.println("test_2");
}
	@Test(priority=2
			)
public void test_3() {
	System.out.println("test_3");
}
	@Test(priority=1)
public void test_4() {
	System.out.println("test_4");
}
	
}
