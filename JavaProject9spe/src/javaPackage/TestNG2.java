package javaPackage;

import org.testng.annotations.*;

public class TestNG2 {
	@Test
	public void a3Tst() {
		System.out.println("a3Tst method ran");
	}
	@BeforeMethod
	public void BMet() {
		System.out.println("BMet method ran");
	}
	@AfterMethod
	public void AMet() {
		System.out.println("AMet method ran");
	}
	@AfterTest
	public void ATst() {
		System.out.println("ATst method ran");
	}
	@AfterClass
	public void ACL() {
		System.out.println("ACL method ran");
	}
	@BeforeClass
	public void BCL() {
		System.out.println("BCL method ran");
	}
	@Test
	public void abTst() {
		System.out.println("abTst method ran");
	}
	@BeforeSuite
	public void aBSuite() {
		System.out.println("aBSuite method ran");
	}
	public static void main(String[] args) {
		System.out.println("I wont excute only running in JavaMain");
	}

}
