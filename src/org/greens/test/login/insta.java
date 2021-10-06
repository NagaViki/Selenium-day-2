package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
			
			
			WebElement txtusername = driver.findElement(By.className("_2hvTZ pexuQ zyHYP"));
			
			txtusername.sendKeys("Naga");
			
			WebElement txtpassword = driver.findElement(By.className("_2hvTZ pexuQ zyHYP"));
			
			txtpassword.sendKeys("1234");
}
}

//no such element throwing //
