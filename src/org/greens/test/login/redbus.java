package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	
	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement txtfrom = driver.findElement(By.id("src"));
		
		txtfrom.sendKeys("chennai");
		
		WebElement txtto = driver.findElement(By.id("dest"));
		
		txtto.sendKeys("madurai");
		
		
	}

}
