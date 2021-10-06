package org.greens.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NAGA\\OneDrive\\Desktop\\MY CODE\\Selenium-day-2\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		driver.get("https://www.swiggy.com");

		WebElement locat = driver.findElement(By.id("location"));

		locat.sendKeys("chennai");
	
	
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\OneDrive\\Desktop\\MY CODE\\Selenium-day-2\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.swiggy.com");
			
			
		 WebElement locat = driver.findElement(By.id("location"));
		 
				
			locat.sendKeys("chennai");
			
			System.out.println(locat.getAttribute("value"));
			
			

	}
}
