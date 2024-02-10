package javaPackage;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG5 {

	@Test(enabled=true,priority=-1,invocationCount=2)
	public void a() {

		Assert.assertTrue(5>15);
		{
			System.out.println("Assertion failed");
		}
	}
	@Test(dependsOnMethods="a")
	public void b() {
		System.out.println("b test ran");
	}



}
