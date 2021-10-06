package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	
	public static void main(String[] args) {
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.snapdeal.com/login");
			
			
		 WebElement mail = driver.findElement(By.className("col-xs-24"));
		 
				
			mail.sendKeys("jnv.com");

}
}