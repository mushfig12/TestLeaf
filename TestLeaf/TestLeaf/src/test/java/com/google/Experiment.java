package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver.exe");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		chromeDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		chromeDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	

	chromeDriver.findElement(By.id("identifierId")).sendKeys("mushfigtahir");		
	chromeDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	chromeDriver.findElement(By.name("password")).sendKeys("celeniumwar");
	
	//chromeDriver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	chromeDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	
	
	}

}
