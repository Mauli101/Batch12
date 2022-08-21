package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Anotation{
// testng is a test management tool / framework
// testng genrates good html report
// it is a tdd framework >> test driven  devolopment framework
// different anotations
// different keywords
/* @BeforSuite
   @BeforeClass
   @BeforeMethod
   @Test1
   @Test2
   @AfterMethod
   @AfterClass
   @AfterSuite
suite and class anotations executes only once and beforemethod annotation executes multiple times w.r.t. no of test cases; */

@BeforeSuite
public void bs(){
System.out.println("bs");
}

@BeforeClass
public void bc(){
System.out.println("bc");
}

@BeforeMethod
public void bm(){
System.out.println("bm");
}
@Test
public void test_1(){
System.out.println("test_1");
}

@Test
public void test_2(){
System.out.println("test_2");
}

@AfterMethod
public void am(){
System.out.println("am");
}

@AfterClass
public void ac(){
System.out.println("ac");
}

@AfterSuite
public void as(){
System.out.println("as");
}

}