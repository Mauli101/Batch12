package TestNG;

import org.testng.annotations.Test;

public class enabledfalse {
	
	@Test
	public void A() {
		System.out.println("A");
	}
	@Test(enabled=false)
	public void B() {
		System.out.println("B");
	}
	@Test
	public void C() {
		System.out.println("C");
	}

}
