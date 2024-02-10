package javaPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrr {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("Ran");
		
		Thread.sleep(1000, 50);
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.google.com/");

		driver.navigate().refresh();
		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
	}
}
