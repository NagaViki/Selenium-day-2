package org.greens.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lvbank {
	
	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGA\\eclipse-workspace\\Selenium 2nd day\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		//right click not enable//
	}

}
