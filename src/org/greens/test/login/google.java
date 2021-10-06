package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebElement txtinput = driver.findElement(By.id("input"));
		
		txtinput.sendKeys("GreensTechnology");
		
		//no such element throwing //
		
	}

}
