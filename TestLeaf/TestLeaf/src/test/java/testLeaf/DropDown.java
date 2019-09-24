package testLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import common.Common;
import driver.Driver;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = Driver.getDriver("chrome");
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		Common.sleep(2);
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(2);
		
		Common.sleep(4);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		select = new Select(dropdown2);
		select.selectByVisibleText("Loadrunner");
		Common.sleep(4);
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		select = new Select(dropdown3);
		select.selectByValue("3");
		Common.sleep(4);
		
		WebElement dropdown4 = driver.findElement(By.cssSelector("[class='dropdown']"));
		select = new Select(dropdown4);
		
		List<WebElement> optionsOfDropDown4 = select.getOptions();
		int numberOfOptions = optionsOfDropDown4.size();
		
		System.out.println(numberOfOptions);
		
		for (WebElement option: optionsOfDropDown4) {
			System.out.println(option.getText());
		}
		WebElement dropdown5 = driver.findElement(By.xpath("(//select)[5]"));
		//select = new Select(dropdown5);
		dropdown5.sendKeys("UFT/QTP");
		
		WebElement dropdown6 = driver.findElement(By.xpath("(//select)[6]"));
		select = new Select(dropdown6);
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
//		if (isMultiple) {
//			select.selectByIndex(1);
//			select.selectByIndex(2);
//			select.selectByIndex(3);
//		}
		
		Actions actions = new Actions(driver);
		
		
		actions.keyDown(Keys.CONTROL)
		.click(select.getOptions().get(1))
		.click(select.getOptions().get(2))
		.click(select.getOptions().get(3))
		.keyUp(Keys.CONTROL).build().perform();
	
		
		Common.sleep(10);
		driver.quit();
		
		
		
		
	}

}
