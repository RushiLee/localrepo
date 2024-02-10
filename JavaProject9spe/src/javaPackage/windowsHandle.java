package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Thread.sleep(2000);
		
		//get the total no of oppen windows tab
		Set <String> Allwin=driver.getWindowHandles();
		System.out.println(Allwin);
		
		Iterator<String> IT=Allwin.iterator();
		String w1=IT.next();
		String w2=IT.next();
		System.out.println(w2);
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().window(w1).getTitle());
		
		driver.switchTo().window(w2);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		
		//Popup handling
		driver.switchTo().window(w1);
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		Set <String> Allwin2=driver.getWindowHandles();
		Iterator <String> IT2=Allwin2.iterator();
		String w3=IT2.next();
		String w4=IT2.next();
		
		System.out.println(driver.switchTo().window(w4).getTitle());
		Thread.sleep(2000);
		//Quit will close complete chrome application including all windowss
		driver.quit();
		
	}

}
