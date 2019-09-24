package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Common;

public class GoogleSearch {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver.exe");
	
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.google.com/");
		chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Common.sleep(2);
		chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Common.sleep(2);
		chromeDriver.findElement(By.name("q")).sendKeys("Koroglu");
		Common.sleep(2);
		chromeDriver.findElement(By.name("btnK")).click();
		Common.sleep(2);
		chromeDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[3]/div/div/div[1]/a/div/cite")).click();
		                                
		
		
	

	}

}
