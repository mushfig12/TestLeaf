package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.Common;
import driver.Driver;

public class Images extends Driver{

	public static void main(String[] args) {
		WebDriver driver = getDriver("chrome");
       
        String imagesURL = "http://testleaf.herokuapp.com/pages/Image.html";
        driver.get(imagesURL);
        driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
        Common.sleep(5);
        driver.navigate().back();
        
		Boolean imgBroken = driver.findElement(By.xpath("//label[@for='position'][1]//following-sibling::img")).isDisplayed();
		System.out.println(imgBroken);  
		Actions action = new Actions(driver); 
		  Common.sleep(2); 
		  WebElement mouseClickImage = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")); 
		  action.click(mouseClickImage).perform(); 
		  Common.sleep(7); 
		  driver.quit();
		 

	}

}
