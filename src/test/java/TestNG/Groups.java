package TestNG;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="Sanity")
	public void A() {
		System.out.println("A");
	}
	@Test(groups="Critical Regression")
	public void B() {
		System.out.println("B");
	}
	@Test(groups="Regression")
	public void C() {
		System.out.println("C");
	}
	@Test(groups="Regression")
	public void D() {
		System.out.println("D");
	}
}
