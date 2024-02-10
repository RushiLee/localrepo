package javaPackage;

import org.testng.annotations.*;

public class TestNG4 {
	
	@Test(enabled=false)
	public void a() {
		System.out.println("a test ran");
	}
	@Test(enabled=true)
	public void b() {
		System.out.println("b test ran");
	}
	@Test(invocationCount=2)
	public void c() {
		System.out.println("c twice ran");
	}
	@Test(invocationCount=0)
	public void d() {
		System.out.println("d not ran");
	}
	
}
