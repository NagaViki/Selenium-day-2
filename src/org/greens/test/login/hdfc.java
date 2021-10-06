package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {
	
	public static void main(String[] args) {
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://netbanking.hdfcbank.com/");
			
			 WebElement custid = driver.findElement(By.className("form-control text-muted"));
				
				custid.sendKeys("7418292731");
				
		
			
	}
}
