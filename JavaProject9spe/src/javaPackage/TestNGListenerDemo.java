package javaPackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListner.class)
public class TestNGListenerDemo {

	@Test 
	public void aMeth() {
		System.out.println("TEst 1");
	}
	
}
