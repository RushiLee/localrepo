package javaPackage;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class Assertion2 {
	
	int a=5;
	int b=33;
	String P="Lee";
	String Q="LEE";
	String M=null;

	@Test
	public void f()
	{
		assertTrue(a<b);
		System.out.println("AssertTrue is True");
		
		try {
			assertFalse(a<b);
			System.out.println("AssertFalse is True");
		} catch (Error e) {
			e.printStackTrace();
			System.out.println("we Escaped the trap of Assertion");
		}
		
		assertNull(M);
		System.out.println("AssertNull is True");

		
	}
	
}
