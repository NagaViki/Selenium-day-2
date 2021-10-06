package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {

	
	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/login");
	
        WebElement txtphone = driver.findElement(By.name("session[username_or_email]"));
		
		txtphone.sendKeys("7418292731");
		
		WebElement txtpass = driver.findElement(By.name("session[password]"));
		
		txtpass.sendKeys("14568");
	
		
		//no such element throwing //
	}
	
}
