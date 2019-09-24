package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Common;
import driver.Driver;
import okhttp3.internal.http2.Header;

public class Edit {
	
	  /**
     * Step 1 Navigate to test leaf home page
     * Step 2 Click on Edit link
     * Step 3 Validate page header --> Work with Edit Fields
     * Step 4 Enter you email address
     */
	public static void main(String[] args)  {
		WebDriver chromeDriver1 = Driver.getDriver("firefox");
		Common.sleep(2);
		chromeDriver1.get("http://testleaf.herokuapp.com/");
		//chromeDriver1.findElement(By.xpath("(//img)[2]")).click();
		
		chromeDriver1.findElement(By.linkText("Edit")).click();
		String header = chromeDriver1.findElement(By.tagName("h1")).getText();
		if (header.equals("Work with Edit Fields") ){
			System.out.println("Header validation is passed");
			
		} else {System.out.println("Header validation failed");
			
	}
		
		
		
		chromeDriver1.findElement(By.id("email")).sendKeys("mushfigtahir@gmail.com");
		
		chromeDriver1.findElement(By.cssSelector("[value='Append ']")).sendKeys("Salam");
		
		
		
		
		
		
		
		
		String value = chromeDriver1.findElement(By.name("username")).getAttribute("value");
		
		 /*
         * To get text out of text box, you should use getAttribute("value") method
         */
		
		System.out.println(value);
		chromeDriver1.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		//WebElement webElement =  
		boolean isDisabled = !chromeDriver1.findElement(By.cssSelector("[disabled='true']")).isEnabled();
	
		System.out.println(isDisabled);
		//input[@name='username'] >> xpath 
		// relative xpath 
		//input- tag name
		//name - attribute of the element
		// 'username' - value of attribute
		// (//input[@name='username'])[2]
		
//chromeDriver1.quit();
}
	
}