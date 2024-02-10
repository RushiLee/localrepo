package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		WebElement Drag=driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.clickAndHold(Drag).dragAndDropBy(Drag, 100, 50).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement drop=driver.findElement(By.xpath("//a[text()='Droppable']"));
		act.click(drop).build().perform();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement Drag1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(Drag1, Drop).build().perform();
	}
}
