package javaPackage;

import org.testng.annotations.*;

public class TestNG3 {
	
	@Test(priority=-10)
	public void a() {
		System.out.println("-10 Priority method ran");
	}
	@Test(priority=0)
	public void b() {
		System.out.println("No Priority method ran");
	}
	@Test(priority=10)
	public void c() {
		System.out.println("10 Priority method ran");
	}
	@Test
	public void d() {
		System.out.println("d Priority method ran");
	}

}
