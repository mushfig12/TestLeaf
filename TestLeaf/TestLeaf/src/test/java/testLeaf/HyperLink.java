package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Common;
import driver.Driver;

public class HyperLink {

	public static void main(String[] args) {
		WebDriver chromeDriver1 = Driver.getDriver("chrome");
        chromeDriver1.get("http://testleaf.herokuapp.com/pages/Link.html");
        
        Common.sleep(2);
        chromeDriver1.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
        Common.sleep(2);
        chromeDriver1.navigate().back();
       String buttonHtml = chromeDriver1.findElement(By.xpath("(//a[@href='Button.html'])")).getAttribute("href");
        System.out.println("Clicking this button will take us: " + buttonHtml);
        chromeDriver1.findElement(By.xpath("(//a[text()='Verify am I broken?'])")).click();
       String notFoundPage = chromeDriver1.findElement(By.tagName("p")).getText();
       System.out.println("This page is broken: " + notFoundPage);
       Common.sleep(2);
       chromeDriver1.navigate().back();
       chromeDriver1.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
       chromeDriver1.navigate().back();
       chromeDriver1.findElement(By.xpath("//a[text()='How many links are available in this page?']")).click();
       chromeDriver1.quit();
       
}

	}


