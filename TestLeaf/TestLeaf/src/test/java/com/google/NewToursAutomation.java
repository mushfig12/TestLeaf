package com.google;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewToursAutomation {
 
	private static String autoEmail(String name, String lastName) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(name).append(".").append(lastName).append("@gmail.com");
	return stringBuilder.toString().toLowerCase();
 }
	private static String autoUserName(String name, String lastName) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(name).append(".").append(lastName);
	return stringBuilder.toString().toLowerCase();
 }
	private static String autoPassword(String name, String lastName) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(name).append(".").append(lastName).append(123);
	return stringBuilder.toString().toLowerCase();
 }
	
 
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter first name: ");
		String name = scanner.nextLine();
		
		System.out.println("Please, enter last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Please, enter phone: ");
		String phoneNumber = scanner.nextLine();
		
		String emailMy = autoEmail(name, lastName);
		System.out.println("Please, enter address: ");
		String address1 = scanner.nextLine();
		System.out.println("Please, enter address2: ");
		String address2 = scanner.nextLine();
		System.out.println("Please, enter city: ");
		String city = scanner.nextLine();
		System.out.println("Please, enter state: ");
		String state = scanner.nextLine();
		System.out.println("Please, enter postal code: ");
		String postalCode = scanner.nextLine();
		System.out.println("Please, enter country: ");
		String country = scanner.nextLine();
		
		String userName23 = autoUserName(name,lastName);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver.exe");
		ChromeDriver chromeDriver1 = new ChromeDriver();
		
		
		
		
		chromeDriver1.get("http://www.newtours.demoaut.com/");
		
//		chromeDriver1.findElement(By.name("userName")).sendKeys("Mushfig");;
//		chromeDriver1.findElement(By.name("password")).sendKeys("alabula");;
//		chromeDriver1.findElement(By.name("login")).click();
		//By.name("userName") --> locator
		Thread.sleep(3000);
		
		//<a href="mercuryregister.php">REGISTER</a>
		chromeDriver1.findElement(By.linkText("REGISTER")).click();
		chromeDriver1.findElement(By.name("firstName")).sendKeys(name);
		chromeDriver1.findElement(By.name("lastName")).sendKeys(lastName);
		chromeDriver1.findElement(By.name("phone")).sendKeys(phoneNumber);
		chromeDriver1.findElement(By.name("userName")).sendKeys(emailMy);
		
		chromeDriver1.findElement(By.name("address1")).sendKeys(address1);
		chromeDriver1.findElement(By.name("address2")).sendKeys(address2);
		chromeDriver1.findElement(By.name("city")).sendKeys(city);
		chromeDriver1.findElement(By.name("state")).sendKeys(state);
		chromeDriver1.findElement(By.name("postalCode")).sendKeys(postalCode);
		
		WebElement countryDropdown = chromeDriver1.findElement(By.name("country"));
		Select select = new Select(countryDropdown);
		select.selectByVisibleText(country.toUpperCase());
		chromeDriver1.findElement(By.name("email")).sendKeys(userName23);
		String password = autoPassword(name, lastName);
		
		chromeDriver1.findElement(By.name("password")).sendKeys(password);
		chromeDriver1.findElement(By.name("confirmPassword")).sendKeys(password);
		chromeDriver1.findElement(By.name("register")).click();
		Thread.sleep(3000);
		String actualconfirmationText = chromeDriver1.findElement(By.tagName("b")).getText(); // getText returns String
		String expectedConfirmationText = "Dear " + name +" "+ lastName +",";
		if (actualconfirmationText.equals(expectedConfirmationText)) {
			
			System.out.println("You are registered at Mercury");
		}else {System.out.println("Something went wrong...");}
		
		String actualconfirmationText2 = chromeDriver1.findElement(By.xpath("(//b)[2]")).getText(); // getText returns String
		String expectedConfirmationText2 = "Note: Your user name is " + userName23 + ".";
		if (actualconfirmationText2.equals(expectedConfirmationText2)) {
			
			System.out.println("You are registered at Mercury");
		}else {System.out.println("Something went wrong...");}
		
		scanner.close();
	}

}
