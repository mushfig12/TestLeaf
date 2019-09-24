package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver.exe");
		
		WebDriver chromeDriver = new ChromeDriver();

	}

}
