package javaPackage;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		
	//create logger instance
		Logger logger=Logger.getLogger("Log4j");
		PropertyConfigurator.configure("C:\\Users\\User\\eclipse-workspace\\JavaProject9spe\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		logger.info("Facebook Webpage opned on Browser");
		
		driver.manage().window().maximize();
		logger.info("Window maximized");
		
		//driver.manage().timeouts().implicitlyWait(15, null);
		//logger.info("Implicit wait given");
		
			try {
				driver.findElement(By.id("email")).isDisplayed();
				logger.info("Object dislpayed");
			} catch (Exception e) {
				logger.info("Object not available");
			}
		
		
		System.out.println("Ran till End");
	}

}
