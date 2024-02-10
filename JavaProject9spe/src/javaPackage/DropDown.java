package javaPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@role='button'][contains(@id,'u_0_')]")).click();
		//driver.close();
		Thread.sleep(1500);
		//1st way
		List<WebElement> BirthMonth= driver.findElements(By.xpath("//select[@aria-label='Month']/option"));
		BirthMonth.get(0).click();  //Jan
		
		
		//2nd way
		Thread.sleep(1500);
		WebElement M =driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
		Select Month=new Select(M);
		Month.selectByIndex(3);
		Thread.sleep(1500);
		Month.selectByVisibleText("Aug");
		Thread.sleep(2000);
		Month.selectByValue("9");
		System.out.println(Month.getFirstSelectedOption().getText());
		
		
		//3rd
		Thread.sleep(1500);
		List<WebElement> dropdown=Month.getOptions();
		dropdown.get(5).click();
		
		//4th way
		Thread.sleep(1500);
		WebElement MS=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		MS.sendKeys("Oct");
		
		//5th way
		Thread.sleep(1500);
		driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Nov");
	}
	

}
