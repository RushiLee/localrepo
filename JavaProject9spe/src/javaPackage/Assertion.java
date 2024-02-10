package javaPackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		String Expected="Mostly unused website";
		String Expected2="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		String Actual=driver.getTitle();
		System.out.println(Actual);
		assertEquals(Actual, Expected,"they are equal");
		//assert.assertEquals(Actual, Expected,"Not equal");
		//Most Reliable App & Cross Browser Testing Platform | BrowserStack

	}
	
}
