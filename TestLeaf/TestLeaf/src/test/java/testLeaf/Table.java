package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;

public class Table {
	public static void main(String[] args)  {
		WebDriver chromeDriver1 = Driver.getDriver("chrome");
				
				chromeDriver1.get("http://testleaf.herokuapp.com/");
				chromeDriver1.findElement(By.linkText("Table")).click();
				chromeDriver1.findElement(By.name("vital")).click();
				chromeDriver1.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
				chromeDriver1.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
				chromeDriver1.findElement(By.cssSelector("[alt='logo Testleaf']")).click();
}
}