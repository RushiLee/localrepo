package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepos {

	public static void main(String[] args) throws Exception {
	
		File scr1=new File("C:\\Users\\User\\eclipse-workspace\\JavaProject9spe\\Properties\\config.properties");
		File scr2=new File("C:\\Users\\User\\eclipse-workspace\\JavaProject9spe\\Properties\\testdata.properties");
		File scr3=new File("C:\\Users\\User\\eclipse-workspace\\JavaProject9spe\\Properties\\locators.properties");

		FileInputStream fis1=new FileInputStream(scr1);
		FileInputStream fis2=new FileInputStream(scr2);
		FileInputStream fis3=new FileInputStream(scr3);
		
		Properties Pro1=new Properties();
		Pro1.load(fis1);
		Properties Pro2=new Properties();
		Pro2.load(fis2);
		Properties Pro3=new Properties();
		Pro3.load(fis3);
		PropertyConfigurator.configure("C:\\Users\\User\\eclipse-workspace\\JavaProject9spe\\log4j.properties");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Pro1.getProperty("URL1"));
		
		driver.findElement(By.xpath(Pro3.getProperty("Path1"))).sendKeys(Pro2.getProperty("Email"));
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		//driver.findElement(By.xpath(Pro3.getProperty("Path1"))).sendKeys("abc");
		driver.findElement(By.xpath(Pro3.getProperty("Path2"))).sendKeys(Pro2.getProperty("Pass"));


	}

}
