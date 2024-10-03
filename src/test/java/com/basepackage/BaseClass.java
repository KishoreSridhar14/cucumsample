package com.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void driverLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("not defined");
		}
		driver.manage().window().maximize();
	}
	public static void urlLaunch(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
	}
	
	public static void selectClass(WebElement element, String value) {
		Select sc=new Select(element);
		sc.selectByValue(value);
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
public static String fileProperty(String key) throws IOException{
	File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Projectcucum\\src\\test\\resources\\Props\\detail.properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);
	prop.getProperty(key);
	String value=prop.getProperty(key);
	return value;
}
}
