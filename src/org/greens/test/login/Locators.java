package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		
		txtusername.sendKeys("Naga");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		
		txtpassword.sendKeys("asdf");
			
	}
}



