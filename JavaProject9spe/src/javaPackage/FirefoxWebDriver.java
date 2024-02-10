package javaPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxWebDriver {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\new\\geckodriver.exe");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}

}
