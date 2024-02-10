package javaPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSim1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@role]")).click();
	
	driver.manage().window().maximize();

	//create Electronic webElement ref
	WebElement Ele= driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(Ele).perform();
	
	Thread.sleep(3000);
	//driver.navigate().refresh();
	WebElement Fas= driver.findElement(By.xpath("//span[text()='Fashion']"));
	driver.switchTo().defaultContent();
	//act.sendKeys(Fas, Keys.ENTER).build().perform();
	act.moveToElement(Fas).perform();
	System.out.println("Fashion option clicked");
	
	
	
	}

}
