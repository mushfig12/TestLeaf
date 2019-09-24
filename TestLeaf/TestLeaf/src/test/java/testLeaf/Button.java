package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Common;
import driver.Driver;

public class Button {
	
	
	public static void main(String[] args)  {
WebDriver chromeDriver1 = Driver.getDriver("chrome");
		
		chromeDriver1.get("http://testleaf.herokuapp.com/");
		chromeDriver1.findElement(By.linkText("Button")).click();
		
		chromeDriver1.findElement(By.id("home")).click();
		Common.sleep(2);
		String header = chromeDriver1.findElement(By.tagName("h1")).getText();
		String expected = "Locators and Selenium Interactions";
		
		if (header.equals(expected)){
			System.out.println("Header validation is passed");
			
		} else {System.out.println("Header validation failed");
			
	}
		 Common.sleep(2);
	        
	        chromeDriver1.navigate().back();
	        
	        int x =  chromeDriver1.findElement(By.id("position")).getLocation().getX();
	        int y =  chromeDriver1.findElement(By.id("position")).getLocation().getY();
	        System.out.println("x = " + x + ", y = " + y);
	        
	        String color1 =  chromeDriver1.findElement(By.id("color")).getAttribute("style");
	        String color2 =  chromeDriver1.findElement(By.id("color")).getCssValue("background-color");
	        
	        System.out.println(color1);
	        System.out.println(color2);
	        Object size =  chromeDriver1.findElement(By.id("size")).getSize();
	        
	       
	        
	        int height =  chromeDriver1.findElement(By.id("size")).getSize().getHeight();
	        int width =  chromeDriver1.findElement(By.id("size")).getSize().getWidth();
	        
	        System.out.println("height = " + height + ", width = " + width);
	        System.out.println(size.toString());
	        
	        Common.sleep(3);
	       chromeDriver1.quit();

	
}
	
	
}
