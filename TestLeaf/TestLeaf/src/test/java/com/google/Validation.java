package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;

public class Validation {
	
	public static void main(String[] args)  {
		
		
		WebDriver chromeDriver1 = Driver.getDriver("chrome");
		
		chromeDriver1.get("http://www.newtours.demoaut.com/");
		// ==>>x path (//a)[5]
		chromeDriver1.findElement(By.xpath("(//a)[5]")).click();
		
	//	chromeDriver1.findElement(By.linkText("Cruises")).click();
		
		String actualTitle = chromeDriver1.getTitle();
		String actualURL = chromeDriver1.getCurrentUrl();
		sleep(2);
		if (actualTitle.equals("Cruises: Mercury Tours")) {
			
		System.out.println("Title check: pass");
		} else {System.out.println("Title check: fail");}
		if (actualURL.contains("http://www.newtours.demoaut.com/mercurycruise.php")) {
			
			System.out.println("URL check: pass");
			} else {System.out.println("URL check: fail! Actual URL: \" + actualURL");}
			
		sleep(2);
		chromeDriver1.quit();
		
	}
	
	public static void sleep (int seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
